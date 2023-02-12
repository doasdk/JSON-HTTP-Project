
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;


import java.io.File;
import java.io.IOException;
import java.util.*;

import java.util.stream.Stream;


public class Main {

    public static void PrintInfoToChoose(){
        //
        System.out.println("Enter what do you want to do:");
        System.out.println("1. Display a list of measuring stations.");
        System.out.println("2. Display detailed information on measurements by station ID.");
        System.out.println("3. Save the last result in PDF, JSON or XML file.");
        System.out.println("4. Search for all stations in the city");
        System.out.println("5. Exit.");

    }
    public static void PrintFormatChoice(){
        System.out.println("What file format?");
        System.out.println("1. PDF");
        System.out.println("2. JSON");
        System.out.println("3. XML");
        System.out.println("4. Cancel the current operation (cancel choosing what file format)");
    }


    static String id;

    public static void main(String[] args) throws IOException {
        int choice;
        boolean forWhile=true;
        //nice looking "json"
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        System.out.println("This is app with informations from air quality measuring stations");

        Scanner scannerForChoice = new Scanner(System.in);
        Scanner scannerForStringIdOfStation = new Scanner(System.in);
        Scanner scannerForCityName = new Scanner(System.in);
        String result = null;
        String resultForAll = null;


        while (forWhile){
            PrintInfoToChoose();
            choice = scannerForChoice.nextInt();

            switch(choice){
                case 5:
                    forWhile = false;
                    break;
                case 4:
                    System.out.println("Enter city name you are looking for:");
                    String cityName = scannerForCityName.nextLine();

                    resultForAll = RequestHTTP.PrintInfoAboutAllMeasuringStations();

                    ObjectMapper mapperForStream = new ObjectMapper();
                    AllStations[] allStationsStream = mapperForStream.readValue(resultForAll, new TypeReference<AllStations[]>(){});

                    List<AllStations> stationByCityName = Arrays.stream(allStationsStream)
                            .filter(allStations -> Objects.equals(allStations.getCity().getName(), cityName)).toList();
                    stationByCityName.forEach(System.out::println);
                    break;
                case 1:
                    resultForAll = RequestHTTP.PrintInfoAboutAllMeasuringStations();
                    System.out.println(resultForAll);
                    break;
                case 2:
                    System.out.println("Enter id of the measuring station:");

                    id = scannerForStringIdOfStation.nextLine();
                    result = RequestHTTP.PrintInfoAboutSpecificMeasuringStation(id);

                    //to beautify output
                    //Map<String,Object> mapSpecificStation = mapper.readValue(result, MeasuringStation.class);
                    /*for (Map.Entry<String, Object> entry : mapSpecificStation.entrySet()) {
                        System.out.println(entry.getKey() + ":" + entry.getValue().toString());
                    }*/

                    MeasuringStation specificStation = mapper.readValue(result, new TypeReference<MeasuringStation>(){});
                    System.out.println(specificStation);
                    break;
                case 3:
                    PrintFormatChoice();
                    int choiceFormat = scannerForChoice.nextInt();
                    if(result != null){
                    switch (choiceFormat){
                        case 1:
                            boolean isSuccessfullPDF;
                            FileWriter fileWriterPDF = new FileWriter();
                            isSuccessfullPDF = fileWriterPDF.PDFWriter(result);
                            if(isSuccessfullPDF) System.out.println("Success");
                            break;
                        case 2:
                                //write to json
                            boolean isSuccessfullJSON;
                            FileWriter fileWriterJSON = new FileWriter();
                            isSuccessfullJSON = fileWriterJSON.JSONWriter(result);
                            if(isSuccessfullJSON) System.out.println("Success");
                            break;
                        case 3:
                            //write to xml
                            boolean isSuccessfullXML;
                            FileWriter fileWriterXML = new FileWriter();
                            isSuccessfullXML = fileWriterXML.XMLWriter(result);
                            if(isSuccessfullXML) System.out.println("Success");
                            break;
                        case 4:
                            System.out.println("Cancelled");
                            break;
                        }
                    }
            }
        }
    }
}

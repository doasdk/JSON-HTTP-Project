import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.PDPageContentStream;
import org.apache.pdfbox.pdmodel.font.PDType1Font;

import java.io.File;
import java.io.IOException;
import java.util.Map;

public class FileWriter {

    public boolean PDFWriter(String result) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        Map<String,Object> map = mapper.readValue(result, Map.class);

        // generate pretty JSON from map
        String json = mapper.writeValueAsString(map);
        // split by system new lines
        String[] strings = json.split(System.lineSeparator());

        PDDocument document = new PDDocument();
        PDPage page = new PDPage();
        document.addPage(page);

        PDPageContentStream contentStream = new PDPageContentStream(document, page);

        contentStream.setFont(PDType1Font.COURIER, 12);
        contentStream.beginText();
        contentStream.setLeading(14.5f);
        contentStream.newLineAtOffset(25, 725);
        for (String string : strings) {
            contentStream.showText(string);
            contentStream.newLine();
        }
        contentStream.endText();
        contentStream.close();

        document.save("user.pdf");
        document.close();
        return true;
    }

    public boolean JSONWriter(String result) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        Map<String,Object> mapToJSON = mapper.readValue(result, Map.class);
        mapper.writeValue(new File("user.json"), mapToJSON);
        return true;
    }

    public boolean XMLWriter(String result) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
        XmlMapper xmlMapper = new XmlMapper();
        MeasuringStation specificStationToXML = mapper.readValue(result, new TypeReference<MeasuringStation>(){});
        xmlMapper.writeValue(new File("user.xml"), specificStationToXML);
        return true;
    }


}

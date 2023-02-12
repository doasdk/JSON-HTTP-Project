import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FileWriterTest {

    @Test
    void shouldReturnTrueWhenSuccessfullySavedPDFFile() throws IOException {
        FileWriter fileWriterPDF = new FileWriter();
        assertTrue(fileWriterPDF.PDFWriter("null"));
    }
    @Test
    void shouldReturnTrueWhenSuccessfullySavedJSONile() throws IOException {
        FileWriter successfullySavedJSON = new FileWriter();
        assertTrue(successfullySavedJSON.JSONWriter("null"));
    }
    @Test
    void shouldReturnTrueWhenSuccessfullySavedXMLile() throws IOException {
        FileWriter successfullySavedXML = new FileWriter();
        assertTrue(successfullySavedXML.JSONWriter("null"));
    }

}
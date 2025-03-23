package utils;

import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Image;

import java.io.File;
import java.io.IOException;

public class PdfHelper {
    public static void salvarScreenshotEmPdf(File screenshot, String caminhoPdf) {
        // Verifique se o arquivo de imagem existe
        if (screenshot.exists() && screenshot.isFile()) {
            try {
                // Configura o PDF
                PdfWriter writer = new PdfWriter(caminhoPdf);
                PdfDocument pdfDoc = new PdfDocument(writer);
                Document document = new Document(pdfDoc);

                // Cria a imagem a partir do caminho do arquivo
                ImageData imageData = ImageDataFactory.create(screenshot.getAbsolutePath());
                Image image = new Image(imageData);

                // Adiciona a imagem ao documento PDF
                document.add(image);

                // Fecha o documento PDF
                document.close();

                System.out.println("PDF gerado com sucesso: " + caminhoPdf);
            } catch (IOException e) {
                // Log do erro detalhado
                System.err.println("Erro ao salvar o PDF: " + e.getMessage());
                e.printStackTrace();
            }
        } else {
            System.err.println("Arquivo de imagem não encontrado: " + screenshot.getAbsolutePath());
        }
    }
}

package OOP_homework6;
/**
 * Класс документ - описывает документ.
 *
 * Нужно спроектировать подсистему отчетов, которая будет формировать отчеты для документа.
 * document -> report
 * 1. Формирование PDF-файла (потенциально может быть несколько видов разметки этого PDF-файла).
 * 2. Создание JSON-файла с полями документа
 * 3. Создание XML-файла с полями документа
 * 4. ... потенциально отчеты могут добавляться.
 *
 * После реализации задать себе 2 вопроса:
 * 1. Насколько сложно добавить поддержку нового типа отчета?
 * 2. Как будет выглядеть проект, если типов отчетов будет 1000+?
 */

public class ReportEntrypoint {
    public Report create(Document document, String reportType) {
        if (reportType.equals("PDF")) {
            // Create PDF report
            byte[] reportData = createPdfReport(document);
            return new Report(reportData);
        } else if (reportType.equals("JSON")) {
            // Create JSON report
            byte[] reportData = createJsonReport(document);
            return new Report(reportData);
        } else if (reportType.equals("XML")) {
            // Create XML report
            byte[] reportData = createXmlReport(document);
            return new Report(reportData);
        } else {
            throw new UnsupportedOperationException("Invalid report type");
        }
    }
    private byte[] createPdfReport(Document document) {
        String pdfContent = "<pdf><id>" + document.getId() + "</id><number>" + document.getNumber() + "</number></pdf>";
        return pdfContent.getBytes();
    }

    private byte[] createJsonReport(Document document) {
        String jsonContent = "{\"id\":\"" + document.getId() + "\",\"number\":\"" + document.getNumber() + "\"}";
        return jsonContent.getBytes();
    }

    private byte[] createXmlReport(Document document) {
        String xmlContent = "<document><id>" + document.getId() + "</id><number>" + document.getNumber() + "</number></document>";
        return xmlContent.getBytes();
    }
}

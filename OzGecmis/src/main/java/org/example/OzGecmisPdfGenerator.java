import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Image;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.property.UnitValue;
import com.itextpdf.layout.borders.Border;

import java.io.FileNotFoundException;
import java.net.URL;

public class OzGecmisPdfGenerator {

    public static void main(String[] args) {
        String dest = "Burhan_Kocak_CV.pdf"; 

        try {
            PdfWriter writer = new PdfWriter(dest);
            PdfDocument pdf = new PdfDocument(writer);
            Document document = new Document(pdf);

            // ------------------------------------
            // HEADER with PHOTO (TABLE LAYOUT)
            // ------------------------------------
            Table headerTable = new Table(UnitValue.createPercentArray(new float[]{75, 25}))
                    .useAllAvailableWidth()
                    .setBorder(Border.NO_BORDER);

            Cell infoCell = new Cell()
                    .add(new Paragraph("Burhan KOCAK")
                            .setFontSize(28)
                            .setBold())
                    .add(new Paragraph("AI & Software Engineer")
                            .setFontSize(16))
                    .setTextAlignment(TextAlignment.LEFT)
                    .setBorder(Border.NO_BORDER)
                    .setPaddingLeft(10);

            URL imageUrl = OzGecmisPdfGenerator.class.getClassLoader().getResource("profil.jpg");
            if (imageUrl == null) {
                throw new FileNotFoundException("Error: 'profil.jpg' file not found in 'resources' folder!");
            }
            Image foto = new Image(ImageDataFactory.create(imageUrl))
                    .setHeight(100f)
                    .setWidth(100f);

            Cell photoCell = new Cell()
                    .add(foto)
                    .setBorder(Border.NO_BORDER)
                    .setTextAlignment(TextAlignment.RIGHT);

            headerTable.addCell(infoCell);
            headerTable.addCell(photoCell);
            document.add(headerTable);

            document.add(new Paragraph("\n"));

            // -------------------------
            // PROFILE SUMMARY
            // -------------------------
            document.add(new Paragraph("PROFILE").setBold().setFontSize(14));
            document.add(new Paragraph("As a Software Engineering student at Kirklareli University, I am passionate about leveraging artificial intelligence to solve real-world problems. " +
                    "My curiosity lies in uncovering patterns in data and transforming them into intelligent systems that learn, adapt, and evolve. " +
                    "With hands-on experience in machine learning algorithms, particularly in Python and Java, I strive to build impactful AI-driven applications. " +
                    "I am highly motivated to work in innovative teams focused on developing next-generation technologies in the fields of natural language processing, computer vision, and deep learning."));

            document.add(new Paragraph("\n"));

            // -------------------------
            // CONTACT INFO HEADER NOTE (VISIBLE ON OPEN)
            // -------------------------
            document.add(new Paragraph("Please feel free to reach out for collaboration, internships, or AI-related projects. I am always open to exciting opportunities!").setBold().setFontSize(12));
            document.add(new Paragraph("\n"));

            // -------------------------
            // CONTACT INFORMATION
            // -------------------------
            document.add(new Paragraph("CONTACT").setBold().setFontSize(14));
            document.add(new Paragraph("Email: kcakburhan@gmail.com"));
            document.add(new Paragraph("Phone: +90 530 798 48 42"));
            document.add(new Paragraph("Address: Kirklareli, Turkey"));
            document.add(new Paragraph("LinkedIn: linkedin.com/in/burhankocak"));
            document.add(new Paragraph("GitHub: github.com/burhankocak"));

            document.add(new Paragraph("\n"));

            // -------------------------
            // EDUCATION
            // -------------------------
            document.add(new Paragraph("EDUCATION").setBold().setFontSize(14));
            document.add(new Paragraph("Kirklareli University").setBold());
            document.add(new Paragraph("B.S. in Software Engineering (Expected 2026)"));
            document.add(new Paragraph("Relevant Coursework: Data Structures, Algorithms, Artificial Intelligence, Database Systems, Software Design Patterns."));

            document.add(new Paragraph("\n"));

            // -------------------------
            // WORK EXPERIENCE
            // -------------------------
            document.add(new Paragraph("WORK EXPERIENCE").setBold().setFontSize(14));

            Table table = new Table(UnitValue.createPercentArray(new float[]{2, 3, 7}))
                    .useAllAvailableWidth();

            table.addHeaderCell(new Cell().add(new Paragraph("Date").setBold()));
            table.addHeaderCell(new Cell().add(new Paragraph("Company").setBold()));
            table.addHeaderCell(new Cell().add(new Paragraph("Position & Responsibilities").setBold()));

            table.addCell("2025 - Present");
            table.addCell("AI Future Labs");
            table.addCell("AI Developer\n- Developed and fine-tuned NLP models using Transformers (BERT) for sentiment and intent analysis.\n- Built end-to-end ML pipelines with Scikit-learn and TensorFlow for real-time predictive systems.\n- Deployed AI services as RESTful APIs with Flask for seamless integration.");

            table.addCell("2024 - 2025");
            table.addCell("DataVision Ltd.");
            table.addCell("Backend Developer\n- Designed and implemented scalable RESTful APIs using Java and Spring Boot.\n- Managed and optimized PostgreSQL databases, handling complex data queries.\n- Utilized Docker and Jenkins to create CI/CD pipelines and streamline deployments.");

            table.addCell("2023 - 2024");
            table.addCell("TeknoSoft Inc.");
            table.addCell("Software Developer Intern\n- Assisted in building enterprise-level applications with bug fixes and feature additions.\n- Wrote unit and integration tests using JUnit & Mockito, increasing test coverage by 15%.\n- Participated in Agile development cycles and team code reviews.");

            document.add(table);

            document.add(new Paragraph("\n"));

            // -------------------------
            // SKILLS (Categorized)
            // -------------------------
            document.add(new Paragraph("SKILLS").setBold().setFontSize(14));
            document.add(new Paragraph("Programming Languages:").setBold());
            document.add(new Paragraph("Python, Java, C#, SQL, JavaScript"));
            document.add(new Paragraph("AI & Machine Learning:").setBold());
            document.add(new Paragraph("TensorFlow, PyTorch, Scikit-learn, Pandas, NumPy, Natural Language Processing (NLP), Computer Vision, Deep Learning"));
            document.add(new Paragraph("Technologies & Frameworks:").setBold());
            document.add(new Paragraph("Spring Boot, Django, Docker, Git, Jenkins, REST APIs, PostgreSQL"));
            document.add(new Paragraph("Core Competencies:").setBold());
            document.add(new Paragraph("Data Structures & Algorithms, Object-Oriented Design, Agile Methodologies, Model Deployment"));

            document.add(new Paragraph("\n"));

            // -------------------------
            // INTERESTS
            // -------------------------
            document.add(new Paragraph("INTERESTS").setBold().setFontSize(14));
            document.add(new Paragraph("Competitive programming (LeetCode, HackerRank), contributing to open-source AI projects, following cutting-edge AI research on ArXiv, exploring autonomous systems, and playing chess."));

            document.close();

            System.out.println("PDF created successfully: " + dest);

        } catch (FileNotFoundException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

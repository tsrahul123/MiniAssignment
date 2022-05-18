package com.rahul.springdemo.demo.helper;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import org.springframework.web.multipart.MultipartFile;
import com.rahul.springdemo.demo.model.tutorial;

public class csvhelper {
    public static String TYPE = "text/csv";
    static String[] HEADERs = { "imdb_title_id", "title", "original_title", "year", "date_published",  "genre", "duration", "country", "language", "director", "writer", "production_company", "actors", "description", "avg_vote", "votes", "budget", "usa_gross_income", "worlwide_gross_income", "metascore", "reviews_from_users", "reviews_from_critics" };
    public static boolean hasCSVFormat(MultipartFile file) {
        if (!TYPE.equals(file.getContentType())) {
            return false;
        }
        return true;
    }
    public static List<tutorial> csvToTutorials(InputStream is) {
        try (BufferedReader fileReader = new BufferedReader(new InputStreamReader(is, "UTF-8"));
             CSVParser csvParser = new CSVParser(fileReader,
                     CSVFormat.DEFAULT.withFirstRecordAsHeader().withIgnoreHeaderCase().withTrim());) {
            List<tutorial> tutorials = new ArrayList<tutorial>();
            Iterable<CSVRecord> csvRecords = csvParser.getRecords();
            for (CSVRecord csvRecord : csvRecords) {
                tutorial tutorial = new tutorial(
                        csvRecord.get("imdb_title_id"),
                        csvRecord.get("title"),
                        csvRecord.get("original_title"),
                        Integer.parseInt(csvRecord.get("year")),
                csvRecord.get("date_published"),
                csvRecord.get("genre"),
                        Integer.parseInt(csvRecord.get("duration")),
                csvRecord.get("country"),
                csvRecord.get("language"),
                csvRecord.get("director"),
                csvRecord.get("writer"),
                csvRecord.get("production_company"),
                csvRecord.get("actors"),
                csvRecord.get("description"),
                        Float.parseFloat(csvRecord.get("avg_vote")),
                        Integer.parseInt(csvRecord.get("votes")),
                csvRecord.get("budget"),
                        csvRecord.get("usa_gross_income"),
                        csvRecord.get("worlwide_gross_income"),
                        csvRecord.get("metascore"),
                        Integer.parseInt(csvRecord.get("reviews_from_users")),
                        Integer.parseInt(csvRecord.get("reviews_from_critics")));
                tutorials.add(tutorial);
            }
            return tutorials;
        } catch (IOException e) {
            throw new RuntimeException("fail to parse CSV file: " + e.getMessage());
        }
    }
}

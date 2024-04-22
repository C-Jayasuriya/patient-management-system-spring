package com.efutures.Controller;

import com.efutures.Dto.ReportDto;
import com.efutures.Entity.Patient;
import com.efutures.Entity.Report;
import com.efutures.Service.ReportService;
import com.efutures.Util.ReportUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportController {
    @Autowired
    ReportService reportService;

    @Autowired
    ReportUtil reportUtil;

    @GetMapping("/logReport")
    void logReport() {
        reportService.log();
    }

    @PostMapping("/report")
    public void saveReport(@RequestBody ReportDto reportDto) {
        Report convertedReport = reportUtil.convert(reportDto);
        reportService.addReport(reportDto);
    }


    @GetMapping("/report/{id}")
    public Report getReport(@PathVariable("id") Integer id) {
        return reportService.getReportById(id);
    }

    @GetMapping("/reports")
    public List<Report> getAllReports() {
        return reportService.getAllReports();
    }

    /*@PutMapping("/report/{id}")
    public void updateReport(@PathVariable("id") Integer id, @RequestBody ReportDto updatedReportDto) {
        Report updatedReport = reportUtil.convert(updatedReportDto);
        reportService.updateReport(id, updatedReport);
    }

    @DeleteMapping("/report/{id}")
    public void deleteReport(@PathVariable("id") Integer id) {
        reportService.deleteReportById(id);
    }*/
}


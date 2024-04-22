package com.efutures.Service;

import com.efutures.Dto.ReportDto;
import com.efutures.Entity.Report;

import java.util.List;

public interface ReportService {
    void log();
    void addReport(ReportDto reportDto);
    Report getReportById(Integer id);
    List<Report> getAllReports();
    void updateReport(Integer id, ReportDto updatedReportDto);
    void deleteReportById(Integer id);
}

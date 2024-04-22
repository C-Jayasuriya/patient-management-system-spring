package com.efutures.ServiceImpl;

import com.efutures.Dto.ReportDto;
import com.efutures.Entity.Report;
import com.efutures.Repository.ReportRepository;
import com.efutures.Service.ReportService;
import com.efutures.Util.ReportUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;
    private final ReportUtil reportUtil;

    @Autowired
    public ReportServiceImpl(ReportRepository reportRepository, ReportUtil reportUtil) {
        this.reportRepository = reportRepository;
        this.reportUtil = reportUtil;
    }

    @Override
    public void log() {
        System.out.println("Inside ReportServiceImpl");
    }

    @Override
    @Transactional
    public void addReport(ReportDto reportDto) {
        // Convert the ReportDto to a Report entity
        Report report = reportUtil.convert(reportDto);

        // If you have any additional processing or validation logic, you can add it here

        // Save the Report entity to the database
        reportRepository.save(report);
    }

    @Override
    public Report getReportById(Integer id) {
        return null;
    }

    @Override
    public List<Report> getAllReports() {
        return null;
    }

    @Override
    public void updateReport(Integer id, ReportDto updatedReportDto) {

    }

    @Override
    public void deleteReportById(Integer id) {

    }
}

package com.efutures.UtilImpl;

import com.efutures.Dto.ReportDto;
import com.efutures.Entity.Report;
import com.efutures.Util.ReportUtil;
import org.springframework.stereotype.Component;

@Component
public class ReportUtilImpl implements ReportUtil {
    public Report convert(ReportDto reportDto){
    Report report = new Report();
        report.setTestType(reportDto.getTestType());
        report.setSpecialNotes(reportDto.getSpecialNotes());
        return report;
    }
}


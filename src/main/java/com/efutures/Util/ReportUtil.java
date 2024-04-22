package com.efutures.Util;

import com.efutures.Dto.ReportDto;
import com.efutures.Entity.Report;

public interface ReportUtil {
    public Report convert(ReportDto reportDto);
}
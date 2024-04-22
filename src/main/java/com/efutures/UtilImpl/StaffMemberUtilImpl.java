package com.efutures.UtilImpl;

import com.efutures.Entity.StaffMember;
import com.efutures.Dto.StaffMemberDto;
import com.efutures.Util.StaffMemberUtil;
import org.springframework.stereotype.Component;

@Component
public class StaffMemberUtilImpl implements StaffMemberUtil {
    public StaffMember convert(StaffMemberDto staffMemberDto ){
        StaffMember staffMember = new StaffMember();
        staffMember.setName(staffMemberDto.getName());
        staffMember.setAvailability(staffMemberDto.getAvailability());
        staffMember.setPosition(staffMemberDto.getPosition());
        return staffMember;
    }

}

package com.efutures.ServiceImpl;

import com.efutures.Entity.StaffMember;
import com.efutures.Service.StaffMemberService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Profile(value = "qa")
public class AsiriStaffMemberServiceImpl implements StaffMemberService {
    @Override
    public void log() {
        System.out.println("Inside AsiriStaffMemberServiceImpl");
    }

    @Override
    public void addStaffMember(StaffMember staffMember) {

    }

    @Override
    public StaffMember getStaffMemberById(int id) {
        return null;
    }

    @Override
    public List<StaffMember> getAllStaffMembers() {
        return null;
    }

    @Override
    public void deleteStaffMemberById(int id) {

    }

    @Override
    public void updateStaffMember(Integer id, StaffMember updatedStaffMember) {

    }
}

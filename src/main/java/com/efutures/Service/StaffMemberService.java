package com.efutures.Service;

import com.efutures.Entity.StaffMember;

import java.util.List;

public interface StaffMemberService {
    public void log();
    public void addStaffMember(StaffMember staffMember);

    public StaffMember getStaffMemberById(int id);

    public List<StaffMember> getAllStaffMembers();
    public void deleteStaffMemberById(int id);


    public void updateStaffMember(Integer id, StaffMember updatedStaffMember);
}

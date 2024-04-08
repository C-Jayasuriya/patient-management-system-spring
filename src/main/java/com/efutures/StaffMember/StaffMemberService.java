package com.efutures.StaffMember;

import java.util.List;

public interface StaffMemberService {

    public void addStaffMember(StaffMember staffMember);

    public StaffMember getStaffMemberById(int id);

    public List<StaffMember> getAllStaffMembers();
    public void deleteStaffMemberById(int id);


    public void updateStaffMember(Integer id, StaffMember updatedStaffMember);
}

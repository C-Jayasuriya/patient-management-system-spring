package com.efutures.StaffMember;
import com.efutures.StaffMember.StaffMemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StaffMemberService {

    private final StaffMemberRepository staffMemberRepository;

    @Autowired
    public StaffMemberService(StaffMemberRepository staffMemberRepository) {
        this.staffMemberRepository = staffMemberRepository;
    }

    public List<StaffMember> getAllStaffMembers() {
        return staffMemberRepository.findAll();
    }

    public StaffMember getStaffMemberById(int id) {
        return staffMemberRepository.findById(id).orElse(null);
    }

    public void saveStaffMember(StaffMember staffMember) {
        staffMemberRepository.save(staffMember);
    }

    public void deleteStaffMemberById(int id) {
        staffMemberRepository.deleteById(id);
    }
}

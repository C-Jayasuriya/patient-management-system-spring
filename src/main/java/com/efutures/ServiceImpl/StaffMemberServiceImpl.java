package com.efutures.ServiceImpl;
import com.efutures.Entity.StaffMember;
import com.efutures.Repository.StaffMemberRepository;
import com.efutures.Service.StaffMemberService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile(value = "dev")
@Transactional
public class StaffMemberServiceImpl implements StaffMemberService {

    private final StaffMemberRepository staffMemberRepository;

    @Autowired
    public StaffMemberServiceImpl(StaffMemberRepository staffMemberRepository) {
        this.staffMemberRepository = staffMemberRepository;
    }

    @Override
    public void log() {
        System.out.println("Inside StaffMemberServiceImpl");
    }

    public void addStaffMember(StaffMember staffMember) {

        staffMemberRepository.save(staffMember);
    }

    public StaffMember getStaffMemberById(int id) {
        return staffMemberRepository.findById(id).orElse(null);
    }

    public List<StaffMember> getAllStaffMembers() {

        return staffMemberRepository.findAll();
    }

    public void deleteStaffMemberById(int id) {
        staffMemberRepository.deleteById(id);
    }


    public void updateStaffMember(Integer id, StaffMember updatedStaffMember) {
        StaffMember existingStaffMember = staffMemberRepository.findById(id).orElse(null);
        if (existingStaffMember != null) {
            existingStaffMember.setName(updatedStaffMember.getName());
            existingStaffMember.setPosition(updatedStaffMember.getPosition());
            existingStaffMember.setAvailability(updatedStaffMember.getAvailability());
            staffMemberRepository.save(existingStaffMember);
        }
    }
}

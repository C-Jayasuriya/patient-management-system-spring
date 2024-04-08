package com.efutures.StaffMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffMemberController {

    @Autowired
    private StaffMemberServiceImpl staffMemberServiceImpl;

    @PostMapping("/staffMember")
    public void saveStaffMember(@RequestBody StaffMember staffMember) {
        staffMemberServiceImpl.addStaffMember(staffMember);
    }
    @GetMapping("/staffMember/{id}")
    public StaffMember getStaffMember(@PathVariable("id") Integer id){
        StaffMember staffMemberById = staffMemberServiceImpl.getStaffMemberById(id);
        return staffMemberById;
    }
    @GetMapping("/staffMembers")
    public List<StaffMember> getAllDoctors() {
        return staffMemberServiceImpl.getAllStaffMembers();
    }
    @PutMapping("/staffMember/{id}")
    public void updateStaffMember(@PathVariable("id") Integer id, @RequestBody StaffMember updatedStaffMember) {
        staffMemberServiceImpl.updateStaffMember(id, updatedStaffMember);
    }

    @DeleteMapping("/staffMember/{id}")
    public void deleteStaffMember(@PathVariable("id") Integer id) {
        staffMemberServiceImpl.deleteStaffMemberById(id);
    }

}


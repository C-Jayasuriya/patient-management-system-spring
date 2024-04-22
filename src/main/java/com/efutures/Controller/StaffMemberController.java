package com.efutures.Controller;

import com.efutures.Dto.StaffMemberDto;
import com.efutures.Entity.StaffMember;
import com.efutures.Service.StaffMemberService;
import com.efutures.Util.StaffMemberUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StaffMemberController {

    @Autowired
    private StaffMemberService staffMemberService;

    @Autowired
    private StaffMemberUtil staffMemberUtil;
    @GetMapping("/logStaffMember")
    void logProfile(){
        staffMemberService.log();
    }

    @PostMapping("/staffMember")
    public void saveStaffMember(@RequestBody StaffMemberDto staffMemberDto) {
        StaffMember convertedStaffMember = staffMemberUtil.convert(staffMemberDto);
        staffMemberService.addStaffMember(convertedStaffMember);
    }
    @GetMapping("/staffMember/{id}")
    public StaffMember getStaffMember(@PathVariable("id") Integer id){
        StaffMember staffMemberById = staffMemberService.getStaffMemberById(id);
        return staffMemberById;
    }
    @GetMapping("/staffMembers")
    public List<StaffMember> getAllDoctors() {
        return staffMemberService.getAllStaffMembers();
    }
    @PutMapping("/staffMember/{id}")
    public void updateStaffMember(@PathVariable("id") Integer id, @RequestBody StaffMember updatedStaffMember) {
        staffMemberService.updateStaffMember(id, updatedStaffMember);
    }

    @DeleteMapping("/staffMember/{id}")
    public void deleteStaffMember(@PathVariable("id") Integer id) {
        staffMemberService.deleteStaffMemberById(id);
    }

}


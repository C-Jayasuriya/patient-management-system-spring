package com.efutures.StaffMember;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/staffMembers")
public class StaffMemberController {

    private final StaffMemberService staffMemberService;
    //
    @Autowired
    public StaffMemberController(StaffMemberService staffMemberService) {
        this.staffMemberService = staffMemberService;
    }

    @GetMapping
    public List<StaffMember> getAllStaffMembers() {
        return staffMemberService.getAllStaffMembers();
    }

    @GetMapping("/{id}")
    public StaffMember getStaffMemberById(@PathVariable int id) {
        return staffMemberService.getStaffMemberById(id);
    }

    @PostMapping
    public void saveStaffMember(@RequestBody StaffMember staffMember) {
        staffMemberService.saveStaffMember(staffMember);
    }

    @DeleteMapping("/{id}")
    public void deleteStaffMemberById(@PathVariable int id) {
        staffMemberService.deleteStaffMemberById(id);
    }
}

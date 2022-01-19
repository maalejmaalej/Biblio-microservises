package biblio.adminservice.controller;

import biblio.adminservice.entity.Admin;
import biblio.adminservice.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admins")
@Slf4j
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/")
    public Admin saveAdmin(@RequestBody Admin admin){
        return adminService.saveAdmin(admin);
    }

    @GetMapping("/")
    public List<Admin> getAdmins(){
        return adminService.getAdmins();
    }

    @GetMapping("/{id}")
    public Optional<Admin> getAdmin(@PathVariable String id){
        return adminService.getAdmin(id);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteAdmin(@PathVariable String id) {
        return adminService.deleteAdmin(id);
    }
}

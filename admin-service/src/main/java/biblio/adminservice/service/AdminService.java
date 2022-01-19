package biblio.adminservice.service;

import biblio.adminservice.entity.Admin;
import biblio.adminservice.repository.AdminRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    public Admin saveAdmin(Admin admin) {
        return adminRepository.save(admin);
    }


    public List<Admin> getAdmins() {
        return adminRepository.findAll();
    }
    public Optional<Admin> getAdmin(String id) {
        return adminRepository.findById(id);
    }

    public String deleteAdmin(String id) {
        adminRepository.deleteById(id);
        return "Admin deleted with cin : " + id;
    }
}

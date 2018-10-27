package implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CertificateRepository;
import service.CertificateService;
import work.Certificate;

import java.util.List;

@Service
public class CertificateImplementation implements CertificateService {

    @Autowired
    private CertificateRepository certificateRepository;


    @Override
    public Certificate addCertificate(Certificate certificate) {
        Certificate newCertificate = certificateRepository.saveAndFlush(certificate);
        return newCertificate;
    }

    @Override
    public void delete(int id) {
        certificateRepository.delete(id);
    }

    @Override
    public Certificate editCertificate(Certificate certificate) {
        return certificateRepository.saveAndFlush(certificate);
    }

    @Override
    public List<Certificate> getAll() {
        return certificateRepository.findAll();
    }
}

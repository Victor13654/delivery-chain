package implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CertyficateRepository;
import service.CertificateService;
import work.Certificate;

import java.util.List;

@Service
public class CertificateImplemetation implements CertificateService {

    @Autowired
    private CertyficateRepository certyficateRepository;


    @Override
    public Certificate addCertificate(Certificate certificate) {
        Certificate certificate1 = certificate.save( certificate);
        return ;
    }
}

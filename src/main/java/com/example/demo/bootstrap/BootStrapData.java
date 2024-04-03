package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.OutsourcedPartService;
import com.example.demo.service.OutsourcedPartServiceImpl;
import com.example.demo.service.ProductService;
import com.example.demo.service.ProductServiceImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());


        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }
         */


        List<Product> products=(List<Product>) productRepository.findAll();
        List<Part> parts=(List<Part>) partRepository.findAll();

        if (products.isEmpty()) {
            Product mechanical = new Product("mechanical", 1000.00, 15);
            Product digital = new Product("digital", 1100.00, 15);
            Product quartz = new Product("quartz", 2000.00, 15);
            Product solar = new Product("solar", 3000.00, 15);
            Product hybrid = new Product("hybrid", 2500.00, 15);
            productRepository.save(mechanical);
            productRepository.save(digital);
            productRepository.save(quartz);
            productRepository.save(solar);
            productRepository.save(hybrid);
        }

        if (parts.isEmpty()) {
            InhousePart casing = new InhousePart();
            casing.setPartId(100);
            casing.setName("case");
            casing.setPrice(300.00);
            casing.setInv(15);
            partRepository.save(casing);

            InhousePart bezel = new InhousePart();
            bezel.setPartId(101);
            bezel.setName("bezel");
            bezel.setPrice(500.00);
            bezel.setInv(15);
            partRepository.save(bezel);

            InhousePart crystal = new InhousePart();
            crystal.setPartId(102);
            crystal.setName("crystal");
            crystal.setPrice(400.00);
            crystal.setInv(15);
            partRepository.save(crystal);

            InhousePart crown = new InhousePart();
            crown.setPartId(103);
            crown.setName("crown");
            crown.setPrice(200.00);
            crown.setInv(15);
            partRepository.save(crown);

            InhousePart strap = new InhousePart();
            strap.setPartId(104);
            strap.setName("strap");
            strap.setPrice(100.00);
            strap.setInv(15);
            partRepository.save(strap);
        }

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}

package com.api.serviaseo.service.implementacion;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.api.serviaseo.model.Factura;
import com.api.serviaseo.repo.IFacturaRepo;
import com.api.serviaseo.service.IFacturaService;

@Service
public class FacturaServiceImpl implements IFacturaService{
    @Autowired
    private IFacturaRepo data;
    @Override
    public Factura save (Factura factura) {
        return data.save(factura);
    }
 
    public List<Factura>get(){    
        return data.findAll();
    }


    public Page<Factura> getPagination(int page, int pageSize){
         Pageable pageable =  PageRequest.of(page, pageSize, Sort.by("id"));
        return data.findAll(pageable);
    }
    

}

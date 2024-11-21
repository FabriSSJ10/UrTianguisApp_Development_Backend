package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.entities.Pedido;
import pe.edu.pe.tf.repositories.IPagoRepository;
import pe.edu.pe.tf.serviceinterface.IPagoService;

import java.util.List;

@Service
public class PagoServiceImplements implements IPagoService {
    @Autowired
    private IPagoRepository pR;

    @Override
    public List<Pago> list() {
        return pR.findAll();
    }

    @Override
    public void insert(Pago p) {
        pR.save(p);
    }

    @Override
    public Pago listId(int id) {
        return pR.findById(id).orElse(new Pago());
    }

    @Override
    public void update(Pago p) {
        pR.save(p);
    }

    @Override
    public void delete(int id) {
        pR.deleteById(id);
    }

    @Override
    public List<String[]> Monto_total_pagos_por_sexo() {
        return pR.Monto_total_pagos_por_sexo();
    }

    @Override
    public List<String[]> Monto_total_pagos_por_departamento() {
        return pR.Monto_total_pagos_por_departamento();
    }

    @Override
    public List<String[]> Cantidad_pagos_por_tipo_pago(){return pR.Cantidad_pagos_por_tipo_pago();}

    @Override
    public List<String[]>Cantidad_pagos_por_tipo_pago_y_mes(){return pR.Cantidad_pagos_por_tipo_pago_y_mes();}

}

package pe.edu.pe.tf.serviceimplements;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.entities.Pago;
import pe.edu.pe.tf.repositories.IOutfitRepository;
import pe.edu.pe.tf.serviceinterface.IOutfitService;

import java.util.List;

@Service
public class OutfitServiceImplements implements IOutfitService{

    @Autowired
    private IOutfitRepository oR;

    @Override
    public List<Outfit> list() {return oR.findAll();}

    @Override
    public void insert(Outfit o) {
        oR.save(o);
    }

    @Override
    public Outfit listId(int id) {
        return oR.findById(id).orElse(new Outfit());
    }

    @Override
    public void update(Outfit o) {
        oR.save(o);
    }

    @Override
    public void delete(int id) {
        oR.deleteById(id);
    }
}

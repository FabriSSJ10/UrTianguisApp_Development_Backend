package pe.edu.pe.tf.controllers;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import pe.edu.pe.tf.dtos.OutfitDTO;
import pe.edu.pe.tf.dtos.PagoDTO;
import pe.edu.pe.tf.dtos.QuantityOutfitsbyClothesDTO;
import pe.edu.pe.tf.entities.Outfit;
import pe.edu.pe.tf.serviceinterface.IOutfitService;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@PreAuthorize("hasAuthority('CLIENTE')")
@RequestMapping("/outfit")
public class OutfitController {
    @Autowired
    private IOutfitService oS;
    @GetMapping("/listarOutfits")
    public List<OutfitDTO> listar(){
        return oS.list().stream().map(x->{
            ModelMapper m=new ModelMapper();
            return m.map(x,OutfitDTO.class);
        }).collect(Collectors.toList());
    }
    @PostMapping("/registrarOutfits")
    public void insertar(@RequestBody OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Outfit ou=m.map(dto,Outfit.class);
        oS.insert(ou);
    }
    @GetMapping("/{id}")
    public OutfitDTO listarId(@PathVariable("id") Integer id){
        ModelMapper m=new ModelMapper();
        OutfitDTO dto=m.map(oS.listId(id),OutfitDTO.class);
        return dto;
    }
    @PutMapping("/modificarOutfits")
    public void modificar(@RequestBody OutfitDTO dto){
        ModelMapper m=new ModelMapper();
        Outfit ou=m.map(dto,Outfit.class);
        oS.update(ou);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        oS.delete(id);
    }

    @GetMapping("/cantidadesOutfitXPrenda")
    public List <QuantityOutfitsbyClothesDTO>obtener()
    {
        List<String []>lista=oS.obtenerCantidad();
        List<QuantityOutfitsbyClothesDTO>listaDTO=new ArrayList<>();
        for (String []columna:lista)
        {
            QuantityOutfitsbyClothesDTO dto=new QuantityOutfitsbyClothesDTO();
            dto.setNameClothes(columna[0]);
            dto.setQuantityOutfits(Integer.parseInt(columna[1]));
            listaDTO.add(dto);
        }
        return listaDTO;
    }
}

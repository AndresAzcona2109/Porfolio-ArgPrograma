
package com.lich.lichporfolio.Interface;

import com.lich.lichporfolio.Entity.Persona;
import java.util.List;



public interface IPersonaService {
    //Traer persona
    public List<Persona> getPersona();
    
    //Guardar un objeto del tipo PERSONA
     public void savePersona(Persona persona);
     
    //Eliminar un objeto por ID
    public void deletePersona(Long id);
    
    //Buscar una persona por ID
    public Persona findPersona (Long id);
}

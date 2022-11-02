package com.curso.spring.ejemplo002;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value ="nominas")
public class NominasServiceImp implements NominasService {
	
	//inyecta en la variable de ref irpService una 
	//instancia de IRPFServiceImp
	@Autowired
	private IRPFService irpfService;
	
	public NominasServiceImp() {
		System.out.println("... constructor nsi");
	}
	
	@Override
	public void calcularNomina() {
		System.out.printf("... tu nomina es %f con un "
				+ " IRPF %5.3f %n",
				233.0, 
				irpfService.calcularIRPF());
	}

}

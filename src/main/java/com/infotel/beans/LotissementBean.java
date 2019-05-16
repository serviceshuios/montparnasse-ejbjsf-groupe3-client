package com.infotel.beans;

import java.io.Serializable;
import java.util.List;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

import com.infotel.ejb.IPersonneRemote;
import com.infotel.metier.Lotissement;
import com.infotel.metier.Personne;

	@Named
	@SessionScoped
	public class LotissementBean implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		// Attributs
		@EJB
		private IPersonneRemote service;
		private Lotissement lotissement= new Lotissement();
		private List<Lotissement> lotissements;
		
		public IPersonneRemote getService() {
			return service;
		}
		public void setService(IPersonneRemote service) {
			this.service = service;
		}
		public Lotissement getLotissement() {
			return lotissement;
		}
		public void setLotissement(Lotissement lotissement) {
			this.lotissement = lotissement;
		}
		public List<Lotissement> getLotissements() {
			return lotissements;
		}
		public void setLotissements(List<Lotissement> lotissements) {
			this.lotissements = lotissements;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
		

		// Méthodes
		
		
		
		public void ajouterLotissement() {
			service.ajouterLotissement(lotissement);
			
		}
		public List<Lotissement> findAllLotissement() {
			return service.findAllLotissement();
		}
		public void modifierLotissement() {
			service.modifierLotissement(lotissement);
		}
		public void supprimerLotissement(Long idLot) {
			service.supprimerLotissement(idLot);
		}
		public Lotissement getLotissement(Long idLot) {
			return service.getLotissement(idLot);
		}
		public Lotissement affichageLotissement(Long idLot) {
			return service.affichageLotissement(idLot);
		}
		
		
		
		public void acheterLotissement(Personne p, Lotissement l) {
			service.acheterLotissement(p, l);
		}
		public void seMarier (Personne p1, Personne p2) {
			service.seMarier(p1, p2);
		}
}

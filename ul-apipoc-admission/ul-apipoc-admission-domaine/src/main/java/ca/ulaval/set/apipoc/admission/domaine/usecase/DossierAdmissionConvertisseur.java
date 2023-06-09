package ca.ulaval.set.apipoc.admission.domaine.usecase;

import ca.ulaval.set.apipoc.admission.domaine.entite.dossierAdmission.DossierAdmissionEntiteDomaine;
import ca.ulaval.set.apipoc.admission.domaine.in.dossierAdmission.DossierAdmissionEntiteDto;
import ca.ulaval.set.apipoc.admission.domaine.out.repository.dossierAdmission.DossierAdmissionEntiteRepo;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = EtablissementEnseignementFrequenteConvertisseur.class)
public interface DossierAdmissionConvertisseur {

    DossierAdmissionEntiteDomaine toDomaine(DossierAdmissionEntiteRepo entiteRepo);

    DossierAdmissionEntiteRepo toRepo(DossierAdmissionEntiteDomaine entiteDomaine);

    DossierAdmissionEntiteDto toDto(DossierAdmissionEntiteDomaine entiteDomaine);
}

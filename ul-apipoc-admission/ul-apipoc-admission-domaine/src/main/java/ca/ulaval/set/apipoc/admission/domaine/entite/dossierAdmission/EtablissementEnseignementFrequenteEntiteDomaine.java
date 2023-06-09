package ca.ulaval.set.apipoc.admission.domaine.entite.dossierAdmission;

import ca.ulaval.set.apipoc.admission.domaine.entite.etablissementEnseignement.EtablissementEnseignementEntiteDomaine;
import lombok.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.UUID;

@Data
// @NoArgsConstructor
@AllArgsConstructor
@Setter(AccessLevel.NONE)
@EqualsAndHashCode(exclude = "idEtablissementEnseignementFrequente")
public class EtablissementEnseignementFrequenteEntiteDomaine {

    private UUID idEtablissementEnseignementFrequente;

    @NotNull
    @Valid
    private EtablissementEnseignementEntiteDomaine etablissementEnseignement;

    @NotNull
    private Integer version;

    public static EtablissementEnseignementFrequenteEntiteDomaine creer(
            EtablissementEnseignementEntiteDomaine etablissementEnseignementEntiteDomaine) {
        return new EtablissementEnseignementFrequenteEntiteDomaine(
                UUID.randomUUID(), etablissementEnseignementEntiteDomaine, 1);
    }
}

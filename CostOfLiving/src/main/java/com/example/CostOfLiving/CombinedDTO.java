package com.example.CostOfLiving;

public class CombinedDTO {
    public SpecialistDTO getSpecialistDTO() {
        return specialistDTO;
    }

    private SpecialistDTO specialistDTO;

    public HubDTO getHubDTO() {
        return hubDTO;
    }

    private HubDTO hubDTO;

    public CombinedDTO(SpecialistDTO specialistDTO, HubDTO hubDTO) {
        this.specialistDTO = specialistDTO;
        this.hubDTO = hubDTO;
    }


}

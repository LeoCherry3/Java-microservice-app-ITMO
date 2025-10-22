package org.Elya_Cherry.pet.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.Elya_Cherry.pet.dto.PetDto;
import org.Elya_Cherry.pet.entities.Pet;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-29T18:28:39+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
@Component
public class PetMapperImpl implements PetMapper {

    @Override
    public PetDto toDto(Pet pet) {
        if ( pet == null ) {
            return null;
        }

        PetDto petDto = new PetDto();

        return petDto;
    }

    @Override
    public Pet toEntity(PetDto dto) {
        if ( dto == null ) {
            return null;
        }

        Pet pet = new Pet();

        return pet;
    }

    @Override
    public List<PetDto> toDtoList(List<Pet> pets) {
        if ( pets == null ) {
            return null;
        }

        List<PetDto> list = new ArrayList<PetDto>( pets.size() );
        for ( Pet pet : pets ) {
            list.add( toDto( pet ) );
        }

        return list;
    }

    @Override
    public List<Pet> toEntityList(List<PetDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Pet> list = new ArrayList<Pet>( dtos.size() );
        for ( PetDto petDto : dtos ) {
            list.add( toEntity( petDto ) );
        }

        return list;
    }
}

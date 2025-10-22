package org.Elya_Cherry.mapper;

import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;
import org.Elya_Cherry.dto.PetDto;
import org.Elya_Cherry.entities.Pet;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-26T16:15:53+0300",
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

        petDto.setId( pet.getId() );
        petDto.setName( pet.getName() );
        petDto.setBreed( pet.getBreed() );
        petDto.setBirthDate( pet.getBirthDate() );
        petDto.setOwnerId( pet.getOwnerId() );
        Set<Long> set = pet.getFriendIds();
        if ( set != null ) {
            petDto.setFriendIds( new LinkedHashSet<Long>( set ) );
        }
        petDto.setColor( pet.getColor() );

        return petDto;
    }

    @Override
    public Pet toEntity(PetDto dto) {
        if ( dto == null ) {
            return null;
        }

        Pet pet = new Pet();

        pet.setId( dto.getId() );
        pet.setName( dto.getName() );
        pet.setBreed( dto.getBreed() );
        pet.setBirthDate( dto.getBirthDate() );
        pet.setOwnerId( dto.getOwnerId() );
        Set<Long> set = dto.getFriendIds();
        if ( set != null ) {
            pet.setFriendIds( new LinkedHashSet<Long>( set ) );
        }
        pet.setColor( dto.getColor() );

        return pet;
    }
}

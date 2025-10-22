package org.Elya_Cherry.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.Elya_Cherry.dto.OwnerDto;
import org.Elya_Cherry.entities.Owner;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-28T02:41:41+0300",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.7 (Oracle Corporation)"
)
@Component
public class OwnerMapperImpl implements OwnerMapper {

    @Override
    public OwnerDto toDto(Owner owner) {
        if ( owner == null ) {
            return null;
        }

        OwnerDto ownerDto = new OwnerDto();

        ownerDto.setId( owner.getId() );
        ownerDto.setName( owner.getName() );
        ownerDto.setBirthday( owner.getBirthday() );

        return ownerDto;
    }

    @Override
    public Owner toEntity(OwnerDto OwnerDto) {
        if ( OwnerDto == null ) {
            return null;
        }

        Owner owner = new Owner();

        owner.setId( OwnerDto.getId() );
        owner.setName( OwnerDto.getName() );
        owner.setBirthday( OwnerDto.getBirthday() );

        return owner;
    }

    @Override
    public List<OwnerDto> toDtoList(List<Owner> owners) {
        if ( owners == null ) {
            return null;
        }

        List<OwnerDto> list = new ArrayList<OwnerDto>( owners.size() );
        for ( Owner owner : owners ) {
            list.add( toDto( owner ) );
        }

        return list;
    }
}

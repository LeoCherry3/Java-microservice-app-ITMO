package org.Elya_Cherry.owner.mapper;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.Elya_Cherry.owner.dto.OwnerDto;
import org.Elya_Cherry.owner.entities.Owner;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-09-29T18:28:40+0300",
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

        return ownerDto;
    }

    @Override
    public Owner toEntity(OwnerDto dto) {
        if ( dto == null ) {
            return null;
        }

        Owner owner = new Owner();

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

    @Override
    public List<Owner> toEntityList(List<OwnerDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Owner> list = new ArrayList<Owner>( dtos.size() );
        for ( OwnerDto ownerDto : dtos ) {
            list.add( toEntity( ownerDto ) );
        }

        return list;
    }
}

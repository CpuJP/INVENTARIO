package org.inventario.kyqa.config;

import org.inventario.kyqa.dtos.AuditoriaDto;
import org.inventario.kyqa.entities.Auditoria;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.Instant;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper modelMapper() {
        ModelMapper modelMapper = new ModelMapper();
        modelMapper.getConfiguration()
                .setMatchingStrategy(MatchingStrategies.STRICT)
                .setSkipNullEnabled(true)
                .setFieldAccessLevel(org.modelmapper.config.Configuration.AccessLevel.PRIVATE)
                .setDeepCopyEnabled(true);
        modelMapper.createTypeMap(Auditoria.class, AuditoriaDto.class)
                .addMappings(mapper -> mapper.using(ctx -> (Instant) ctx.getSource()).map(Auditoria::getFecha, AuditoriaDto::setFecha));
        return modelMapper;
    }
}

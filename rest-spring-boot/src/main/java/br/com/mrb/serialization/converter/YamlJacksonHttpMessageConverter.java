package br.com.mrb.serialization.converter;


import org.springframework.http.MediaType;
import org.springframework.http.converter.json.AbstractJackson2HttpMessageConverter;

import com.fasterxml.jackson.dataformat.yaml.YAMLMapper;

public final class YamlJacksonHttpMessageConverter extends AbstractJackson2HttpMessageConverter{

	public YamlJacksonHttpMessageConverter() {
		super(new YAMLMapper(), MediaType.parseMediaType("application/x-yaml"));
	}

}

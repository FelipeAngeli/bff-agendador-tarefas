package com.felipe.bffagendadortarefas.infrastructure.client;

import com.felipe.bffagendadortarefas.business.dto.out.TarefasDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "notificacao", url = "${notificacao.url}")
public interface EmailClient {

    Void enviarEmail(@RequestBody TarefasDTOResponse dto);

}
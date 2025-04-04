package com.felipe.bffagendadortarefas.infrastructure.client;

import com.felipe.bffagendadortarefas.business.dto.in.EnderecoDTORequest;
import com.felipe.bffagendadortarefas.business.dto.in.LoginDTORequest;
import com.felipe.bffagendadortarefas.business.dto.in.TelefoneDTORequest;
import com.felipe.bffagendadortarefas.business.dto.in.UsuarioDTORequest;
import com.felipe.bffagendadortarefas.business.dto.out.EnderecoDTOResponse;
import com.felipe.bffagendadortarefas.business.dto.out.TelefoneDTOResponse;
import com.felipe.bffagendadortarefas.business.dto.out.UsuarioDTOResponse;
import com.felipe.bffagendadortarefas.business.dto.out.ViaCepDTOResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(name = "usuario", url = "${usuario.url}")
public interface UsuarioClient {

    @GetMapping("/usuario")
    UsuarioDTOResponse buscaUsuarioPorEmail(@RequestParam("email") String email,
                                            @RequestHeader("Authorization") String token);

    @PostMapping("/usuario")
    UsuarioDTOResponse salvaUsuario(@RequestBody UsuarioDTORequest usuarioDTO);

    @PostMapping("/login")
    String login(@RequestBody LoginDTORequest usuarioDTO);

    @DeleteMapping("/{email}")
    Void deletaUsuarioPorEmail(@PathVariable String email,
                               @RequestHeader("Authorization") String token);

    @PutMapping
    UsuarioDTOResponse atualizaDadosUsuario(@RequestBody UsuarioDTORequest dto,
                                            @RequestHeader("Authorization") String token);

    @PutMapping("/endereco")
    EnderecoDTOResponse atualizaEndereco(@RequestBody EnderecoDTORequest dto,
                                         @RequestParam("id") Long id,
                                         @RequestHeader("Authorization") String token);

    @PutMapping("/telefone")
    TelefoneDTOResponse atualizaTelefone(@RequestBody TelefoneDTORequest dto,
                                         @RequestParam("id") Long id,
                                         @RequestHeader("Authorization") String token);

    @PostMapping("/endereco")
    EnderecoDTOResponse cadastroEndereco(@RequestBody EnderecoDTORequest dto,
                                         @RequestHeader("Authorization") String token);

    @PostMapping("/telefone")
    TelefoneDTOResponse cadastroTelefone(@RequestBody TelefoneDTORequest dto,
                                         @RequestHeader("Authorization") String token);

    @GetMapping("/endereco/{cep}")
    ViaCepDTOResponse buscarDadosCep(@PathVariable("cep") String cep);

}
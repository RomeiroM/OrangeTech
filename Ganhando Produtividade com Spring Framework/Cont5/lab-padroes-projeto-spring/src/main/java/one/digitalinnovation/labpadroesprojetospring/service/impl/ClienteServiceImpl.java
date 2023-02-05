package one.digitalinnovation.labpadroesprojetospring.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovation.labpadroesprojetospring.model.Cliente;
import one.digitalinnovation.labpadroesprojetospring.model.ClienteRepository;
import one.digitalinnovation.labpadroesprojetospring.model.Endereco;
import one.digitalinnovation.labpadroesprojetospring.model.EnderecoRepository;
import one.digitalinnovation.labpadroesprojetospring.service.ClienteService;
import one.digitalinnovation.labpadroesprojetospring.service.ViaCepService;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    @Override
    public Iterable<Cliente> buscarTodos() {
        // Buscar todos os Clientes.
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.get();
    }
@Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }


    @Override
    public void atualizar(Long id, Cliente cliente) {
        // Buscar Cliente por ID, caso exista:
        Optional<Cliente> clienteBd = clienteRepository.findById(id);
            if(clienteBd.isPresent()){
              salvarClienteComCep(cliente);
 }
}

    @Override
    public void deletar(Long id) {
        // Deletar cliente pelo ID
             clienteRepository.deleteById(id); 
        
    }
        
        private void salvarClienteComCep(Cliente cliente) {
            // Verificar se o Endereço do Cliente já existe (pelo CEP).
            String cep = cliente.getEndereco().getCep();
            Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
                // Caso não exista, integrar com o ViaCEP e persistir o retorno.
                Endereco novEndereco = viaCepService.consultarCep(cep);
                enderecoRepository.save(novEndereco);
                return novEndereco;
            });
            cliente.setEndereco(endereco);
            // Inserir Cliente, Vínculo e Endeereço (novo ou existente).
            clienteRepository.save(cliente);
        }
    
}

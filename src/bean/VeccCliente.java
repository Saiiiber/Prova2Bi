package bean;
// Generated 13/11/2023 10:03:16 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * VeccCliente generated by hbm2java
 */
@Entity
@Table(name="vecc_cliente"
    ,catalog="db_victor_cardoso"
)
public class VeccCliente  implements java.io.Serializable {


     private int idveccCliente;
     private String veccNome;
     private String veccApelido;
     private String veccCpf;
     private String veccTelefone;
     private String veccIdade;
     private String veccEmail;
     private String veccEndereco;
     private int veccSexo;
     private Date veccDataNascimento;
     private String veccNacionalidade;
     private String veccRg;
     private String veccCep;
     private String veccNaturalidade;
     private String veccEstadoCivil;
     private String veccPreferencias;
     private String veccProfissao;
     private String veccTelFixo;


    public VeccCliente() {
    }

    public VeccCliente(int idveccCliente) {
        this.idveccCliente = idveccCliente;
    }
    public VeccCliente(int idveccCliente, String veccNome, String veccApelido, String veccCpf, String veccTelefone, String veccIdade, String veccEmail, String veccEndereco, int veccSexo, Date veccDataNascimento, String veccNacionalidade, String veccRg, String veccCep, String veccNaturalidade, String veccEstadoCivil, String veccPreferencias, String veccProfissao, String veccTelFixo) {
       this.idveccCliente = idveccCliente;
       this.veccNome = veccNome;
       this.veccApelido = veccApelido;
       this.veccCpf = veccCpf;
       this.veccTelefone = veccTelefone;
       this.veccIdade = veccIdade;
       this.veccEmail = veccEmail;
       this.veccEndereco = veccEndereco;
       this.veccSexo = veccSexo;
       this.veccDataNascimento = veccDataNascimento;
       this.veccNacionalidade = veccNacionalidade;
       this.veccRg = veccRg;
       this.veccCep = veccCep;
       this.veccNaturalidade = veccNaturalidade;
       this.veccEstadoCivil = veccEstadoCivil;
       this.veccPreferencias = veccPreferencias;
       this.veccProfissao = veccProfissao;
       this.veccTelFixo = veccTelFixo;
    }
   
     @Id 

    
    @Column(name="idvecc_cliente", unique=true, nullable=false)
    public int getIdveccCliente() {
        return this.idveccCliente;
    }
    
    public void setIdveccCliente(int idveccCliente) {
        this.idveccCliente = idveccCliente;
    }

    
    @Column(name="vecc_nome", length=45)
    public String getVeccNome() {
        return this.veccNome;
    }
    
    public void setVeccNome(String veccNome) {
        this.veccNome = veccNome;
    }

    
    @Column(name="vecc_apelido", length=45)
    public String getVeccApelido() {
        return this.veccApelido;
    }
    
    public void setVeccApelido(String veccApelido) {
        this.veccApelido = veccApelido;
    }

    
    @Column(name="vecc_cpf", length=45)
    public String getVeccCpf() {
        return this.veccCpf;
    }
    
    public void setVeccCpf(String veccCpf) {
        this.veccCpf = veccCpf;
    }

    
    @Column(name="vecc_telefone", length=45)
    public String getVeccTelefone() {
        return this.veccTelefone;
    }
    
    public void setVeccTelefone(String veccTelefone) {
        this.veccTelefone = veccTelefone;
    }

    
    @Column(name="vecc_idade", length=45)
    public String getVeccIdade() {
        return this.veccIdade;
    }
    
    public void setVeccIdade(String veccIdade) {
        this.veccIdade = veccIdade;
    }

    
    @Column(name="vecc_email", length=45)
    public String getVeccEmail() {
        return this.veccEmail;
    }
    
    public void setVeccEmail(String veccEmail) {
        this.veccEmail = veccEmail;
    }

    
    @Column(name="vecc_endereco", length=45)
    public String getVeccEndereco() {
        return this.veccEndereco;
    }
    
    public void setVeccEndereco(String veccEndereco) {
        this.veccEndereco = veccEndereco;
    }

    
    @Column(name="vecc_sexo", length=45)
    public int getVeccSexo() {
        return this.veccSexo;
    }
    
    public void setVeccSexo(int veccSexo) {
        this.veccSexo = veccSexo;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="vecc_data_nascimento", length=10)
    public Date getVeccDataNascimento() {
        return this.veccDataNascimento;
    }
    
    public void setVeccDataNascimento(Date veccDataNascimento) {
        this.veccDataNascimento = veccDataNascimento;
    }

    
    @Column(name="vecc_nacionalidade", length=45)
    public String getVeccNacionalidade() {
        return this.veccNacionalidade;
    }
    
    public void setVeccNacionalidade(String veccNacionalidade) {
        this.veccNacionalidade = veccNacionalidade;
    }

    
    @Column(name="vecc_rg", length=45)
    public String getVeccRg() {
        return this.veccRg;
    }
    
    public void setVeccRg(String veccRg) {
        this.veccRg = veccRg;
    }

    
    @Column(name="vecc_cep", length=45)
    public String getVeccCep() {
        return this.veccCep;
    }
    
    public void setVeccCep(String veccCep) {
        this.veccCep = veccCep;
    }

    
    @Column(name="vecc_naturalidade", length=45)
    public String getVeccNaturalidade() {
        return this.veccNaturalidade;
    }
    
    public void setVeccNaturalidade(String veccNaturalidade) {
        this.veccNaturalidade = veccNaturalidade;
    }

    
    @Column(name="vecc_estado_civil", length=45)
    public String getVeccEstadoCivil() {
        return this.veccEstadoCivil;
    }
    
    public void setVeccEstadoCivil(String veccEstadoCivil) {
        this.veccEstadoCivil = veccEstadoCivil;
    }

    
    @Column(name="vecc_preferencias", length=45)
    public String getVeccPreferencias() {
        return this.veccPreferencias;
    }
    
    public void setVeccPreferencias(String veccPreferencias) {
        this.veccPreferencias = veccPreferencias;
    }

    
    @Column(name="vecc_profissao", length=45)
    public String getVeccProfissao() {
        return this.veccProfissao;
    }
    
    public void setVeccProfissao(String veccProfissao) {
        this.veccProfissao = veccProfissao;
    }

    
    @Column(name="vecc_tel_fixo", length=45)
    public String getVeccTelFixo() {
        return this.veccTelFixo;
    }
    
    public void setVeccTelFixo(String veccTelFixo) {
        this.veccTelFixo = veccTelFixo;
    }
}



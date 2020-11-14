package com.teprofuzy.TEPROFUZY.mappers;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.NullValueCheckStrategy;
import org.mapstruct.NullValueMappingStrategy;
import org.mapstruct.NullValuePropertyMappingStrategy;
import org.mapstruct.factory.Mappers;

import com.teprofuzy.TEPROFUZY.dto.CategoriaEmpleadoDto;
import com.teprofuzy.TEPROFUZY.dto.ClienteDto;
import com.teprofuzy.TEPROFUZY.dto.DireccionDto;
import com.teprofuzy.TEPROFUZY.dto.EmailDto;
import com.teprofuzy.TEPROFUZY.dto.EmpleadoDto;
import com.teprofuzy.TEPROFUZY.dto.EstadoComprobanteDto;
import com.teprofuzy.TEPROFUZY.dto.EstadoDto;
import com.teprofuzy.TEPROFUZY.dto.GeneroDto;
import com.teprofuzy.TEPROFUZY.dto.HistorialProductoTiendaDto;
import com.teprofuzy.TEPROFUZY.dto.HistorialProveedorProductoDto;
import com.teprofuzy.TEPROFUZY.dto.PedidoDto;
import com.teprofuzy.TEPROFUZY.dto.PersonaDto;
import com.teprofuzy.TEPROFUZY.dto.ProductoDto;
import com.teprofuzy.TEPROFUZY.dto.ProveedorDto;
import com.teprofuzy.TEPROFUZY.dto.ProveedorProductoDto;
import com.teprofuzy.TEPROFUZY.dto.TelefonoDto;
import com.teprofuzy.TEPROFUZY.dto.TipoComprobanteDto;
import com.teprofuzy.TEPROFUZY.dto.TipoPagoDto;
import com.teprofuzy.TEPROFUZY.dto.TipoPersonaDto;
import com.teprofuzy.TEPROFUZY.dto.TipoProductoDto;
import com.teprofuzy.TEPROFUZY.dto.TipoUsuarioDto;
import com.teprofuzy.TEPROFUZY.dto.UsuarioDto;
import com.teprofuzy.TEPROFUZY.entities.CategoriaEmpleado;
import com.teprofuzy.TEPROFUZY.entities.Cliente;
import com.teprofuzy.TEPROFUZY.entities.Direccion;
import com.teprofuzy.TEPROFUZY.entities.Email;
import com.teprofuzy.TEPROFUZY.entities.Empleado;
import com.teprofuzy.TEPROFUZY.entities.Estado;
import com.teprofuzy.TEPROFUZY.entities.EstadoComprobante;
import com.teprofuzy.TEPROFUZY.entities.Genero;
import com.teprofuzy.TEPROFUZY.entities.HistorialProductoTienda;
import com.teprofuzy.TEPROFUZY.entities.HistorialProveedorProducto;
import com.teprofuzy.TEPROFUZY.entities.Pedido;
import com.teprofuzy.TEPROFUZY.entities.Persona;
import com.teprofuzy.TEPROFUZY.entities.Producto;
import com.teprofuzy.TEPROFUZY.entities.Proveedor;
import com.teprofuzy.TEPROFUZY.entities.ProveedorProducto;
import com.teprofuzy.TEPROFUZY.entities.Telefono;
import com.teprofuzy.TEPROFUZY.entities.TipoComprobante;
import com.teprofuzy.TEPROFUZY.entities.TipoPago;
import com.teprofuzy.TEPROFUZY.entities.TipoPersona;
import com.teprofuzy.TEPROFUZY.entities.TipoProducto;
import com.teprofuzy.TEPROFUZY.entities.TipoUsuario;
import com.teprofuzy.TEPROFUZY.entities.Usuario;

@Mapper(componentModel = "spring", nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE, nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT, nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface EntitiesDtosMappers {

	EntitiesDtosMappers INSTANCE = Mappers.getMapper(EntitiesDtosMappers.class);

	// PERSONA
	@Mappings({ @Mapping(target = "id", source = "persona.idPersona"),
			@Mapping(target = "dniRuc", source = "persona.dniRuc"),
			@Mapping(target = "nombresRazonSocial", source = "persona.nombresRazonSocial"),
			@Mapping(target = "apellidoPaterno", source = "persona.apellidoPaterno"),
			@Mapping(target = "apellidoMaterno", source = "persona.apellidoMaterno"),
			@Mapping(target = "fechaNacimiento", source = "persona.fechaNacimiento"),
			@Mapping(target = "genero", source = "persona.genero"),
			@Mapping(target = "telefono", source = "persona.telefono"),
			@Mapping(target = "tipoPersona", source = "persona.tipoPersona"),
			@Mapping(target = "email", source = "persona.email"),
			@Mapping(target = "direccion", source = "persona.direccion"),
			@Mapping(target = "usuario", source = "persona.usuario") })
	PersonaDto personaToPersonaDto(Persona persona);

	@Mappings({ @Mapping(target = "idPersona", source = "personaDto.id"),
			@Mapping(target = "dniRuc", source = "personaDto.dniRuc"),
			@Mapping(target = "nombresRazonSocial", source = "personaDto.nombresRazonSocial"),
			@Mapping(target = "apellidoPaterno", source = "personaDto.apellidoPaterno"),
			@Mapping(target = "apellidoMaterno", source = "personaDto.apellidoMaterno"),
			@Mapping(target = "fechaNacimiento", source = "personaDto.fechaNacimiento"),
			@Mapping(target = "genero", source = "personaDto.genero"),
			@Mapping(target = "telefono", source = "personaDto.telefono"),
			@Mapping(target = "tipoPersona", source = "personaDto.tipoPersona"),
			@Mapping(target = "email", source = "personaDto.email"),
			@Mapping(target = "direccion", source = "personaDto.direccion"),
			@Mapping(target = "usuario", source = "personaDto.usuario") })
	Persona personaDtoToPersona(PersonaDto personaDto);

	List<Persona> listPersonaDtoToPersona(List<PersonaDto> personadDtoList);

	List<PersonaDto> listPersonaToPersonaDto(List<Persona> personaList);

	// GENERO
	@Mappings({ @Mapping(target = "id", source = "genero.idGenero"),
			@Mapping(target = "nombre", source = "genero.nombre") })
	GeneroDto generoToGeneroDto(Genero genero);

	@Mappings({ @Mapping(target = "idGenero", source = "generoDto.id"),
			@Mapping(target = "nombre", source = "generoDto.nombre") })
	Genero generoDtoToGenero(GeneroDto generoDto);

	List<Genero> listGeneroDtoToGenero(List<GeneroDto> generoDtoList);

	List<GeneroDto> listGeneroToGeneroDto(List<Genero> generoList);

	// TIPO_PERSONA
	@Mappings({ @Mapping(target = "id", source = "tipoPersona.idTipoPersona"),
			@Mapping(target = "nombre", source = "tipoPersona.nombre") })
	TipoPersonaDto tipoPersonaToTipoPersonaDto(TipoPersona tipoPersona);

	@Mappings({ @Mapping(target = "idTipoPersona", source = "tipoPersonaDto.id"),
			@Mapping(target = "nombre", source = "tipoPersonaDto.nombre") })
	TipoPersona tipoPersonaDtoToTipoPersona(TipoPersonaDto tipoPersonaDto);

	List<TipoPersona> listTipoPersonaDtoToTipoPersona(List<TipoPersonaDto> tipoPersonaDtoList);

	List<TipoPersonaDto> listTipoPersonaToTipoPersonaDto(List<TipoPersona> tipoPersonaList);

	// TELEFONO
	@Mappings({ @Mapping(target = "idTelefono", source = "telefono.idTelefono"),
			@Mapping(target = "numero", source = "telefono.numero"),
			@Mapping(target = "persona", source = "telefono.persona") })
	TelefonoDto telefonoToTelefonoDto(Telefono telefono);

	@Mappings({ @Mapping(target = "idTelefono", source = "telefonoDto.idTelefono"),
			@Mapping(target = "numero", source = "telefonoDto.numero"),
			@Mapping(target = "persona", source = "telefonoDto.persona") })
	Telefono telefonoDtoToTelefono(TelefonoDto telefonoDto);

	List<Telefono> listTelefonoDtoToTelefono(List<TelefonoDto> telefonoDtoList);

	List<TelefonoDto> listTelefonoToTelefonoDto(List<Telefono> telefonoList);

	// EMAIL
	@Mappings({ @Mapping(target = "idEmail", source = "email.idEmail"),
			@Mapping(target = "correo", source = "email.correo"),
			@Mapping(target = "persona", source = "email.persona") })
	EmailDto emailToEmailDto(Email email);

	@Mappings({ @Mapping(target = "idEmail", source = "emailDto.idEmail"),
			@Mapping(target = "correo", source = "emailDto.correo"),
			@Mapping(target = "persona", source = "emailDto.persona") })
	Email emailDtoToEmail(EmailDto emailDto);

	List<Email> listEmailDtoToEmail(List<EmailDto> emailDtoList);

	List<EmailDto> listEmailToEmailDto(List<Email> emailList);

	// DIRECCION
	@Mappings({ @Mapping(target = "idDireccion", source = "direccion.idDireccion"),
			@Mapping(target = "descripcion", source = "direccion.descripcion"),
			@Mapping(target = "persona", source = "direccion.persona") })
	DireccionDto direccionToDireccionDto(Direccion direccion);

	@Mappings({ @Mapping(target = "idDireccion", source = "direccionDto.idDireccion"),
			@Mapping(target = "descripcion", source = "direccionDto.descripcion"),
			@Mapping(target = "persona", source = "direccionDto.persona") })
	Direccion direccionDtoToDireccion(DireccionDto direccionDto);

	List<Direccion> listDireccionDtoToDireccion(List<DireccionDto> direccionDtoList);

	List<DireccionDto> listDireccionToDireccionDto(List<Direccion> direccionList);

	// USARIO
	@Mappings({ @Mapping(target = "idUsuarioDto", source = "usuario.idUsuario"),
			@Mapping(target = "user", source = "usuario.user"),
			@Mapping(target = "password", source = "usuario.password"),
			@Mapping(target = "persona", source = "usuario.persona"),
			@Mapping(target = "tipoUsuario", source = "usuario.tipoUsuario") })
	UsuarioDto usuarioToUsuarioDto(Usuario usuario);

	@Mappings({ @Mapping(target = "idUsuario", source = "usuarioDto.idUsuarioDto"),
			@Mapping(target = "user", source = "usuarioDto.user"),
			@Mapping(target = "password", source = "usuarioDto.password"),
			@Mapping(target = "persona", source = "usuarioDto.persona"),
			@Mapping(target = "tipoUsuario", source = "usuarioDto.tipoUsuario") })
	Usuario direccionDtoToDireccion(UsuarioDto usuarioDto);

	List<Usuario> listUsuarioDtoToUsuario(List<UsuarioDto> usuarioDtoList);

	List<UsuarioDto> listUsuarioToUsuarioDto(List<Usuario> usuarioList);

	// TIPO_USUARIO
	@Mappings({ @Mapping(target = "id", source = "tipoUsuario.idTipoUsuario"),
			@Mapping(target = "nombre", source = "tipoUsuario.nombre"),
			@Mapping(target = "descripcion", source = "tipoUsuario.descripcion") })
	TipoUsuarioDto tipoUsuarioToTipoUsuarioDto(TipoUsuario tipoUsuario);

	@Mappings({ @Mapping(target = "idTipoUsuario", source = "tipoUsuarioDto.id"),
			@Mapping(target = "nombre", source = "tipoUsuarioDto.nombre"),
			@Mapping(target = "descripcion", source = "tipoUsuarioDto.descripcion") })
	TipoUsuario tipoUsuarioStoToTipoUsuario(TipoUsuarioDto tipoUsuarioDto);

	List<TipoUsuario> listTipoUsuarioDtoTipoUsuario(List<TipoUsuarioDto> tipoUsuarioDtoList);

	List<TipoUsuarioDto> listTipoUsuarioToTipoUsuarioDto(List<TipoUsuario> tipoUsuarioList);

	// ESTADO
	@Mappings({ @Mapping(target = "id", source = "estado.idEstado"),
			@Mapping(target = "nombre", source = "estado.nombre") })
	EstadoDto estadoToEstadoDto(Estado estado);

	@Mappings({ @Mapping(target = "idEstado", source = "estadoDto.id"),
			@Mapping(target = "nombre", source = "estadoDto.nombre") })
	Estado estadoDtoToEstado(EstadoDto estadoDto);

	List<Estado> listEstadoDtoToEstado(List<EstadoDto> estadoDtoList);

	List<EstadoDto> listEstadoToEstadoDto(List<Estado> estadoList);

	// PROVEEDOR
	@Mappings({ @Mapping(target = "id", source = "proveedor.idProveedor"),
			@Mapping(target = "persona", source = "proveedor.persona"),
			@Mapping(target = "estado", source = "proveedor.estado") })
	ProveedorDto proveedorToProveedorDto(Proveedor proveedor);

	@Mappings({ @Mapping(target = "idProveedor", source = "proveedorDto.id"),
			@Mapping(target = "persona", source = "proveedorDto.persona"),
			@Mapping(target = "estado", source = "proveedorDto.estado") })
	Proveedor proveedorDtoToProveedor(ProveedorDto proveedorDto);

	List<Proveedor> listProveedorDtoToProveedor(List<ProveedorDto> proveedorDtoList);

	List<ProveedorDto> listProveedorToProveedorDto(List<Proveedor> proveedorList);

	// TIPO_COMPROBANTE
	@Mappings({ @Mapping(target = "id", source = "tipoComprobante.idTipoComprobante"),
			@Mapping(target = "descripcion", source = "tipoComprobante.descripcion") })
	TipoComprobanteDto tipoComprobanteToTipoComprobanteDto(TipoComprobante tipoComprobante);

	@Mappings({ @Mapping(target = "idTipoComprobante", source = "tipoComprobanteDto.id"),
			@Mapping(target = "descripcion", source = "tipoComprobanteDto.descripcion") })
	TipoComprobante tipoComprobanteDtoToTipoComprobante(TipoComprobanteDto tipoComprobanteDto);

	List<TipoComprobante> listTipoComprobanteDtoToTipoComprobante(List<TipoComprobanteDto> tipocomprobanteDtoList);

	List<TipoComprobanteDto> listTipoComprobanteToTipoComprobanteDto(List<TipoComprobante> tipoComprobanteList);

	// TIPO_PRODUCTO
	@Mappings({ @Mapping(target = "id", source = "tipoProducto.idTipoProducto"),
			@Mapping(target = "descripcion", source = "tipoProducto.descripcion") })
	TipoProductoDto tipoProductoToTipoProductoDto(TipoProducto tipoProducto);

	@Mappings({ @Mapping(target = "idTipoProducto", source = "tipoProductoDto.id"),
			@Mapping(target = "descripcion", source = "tipoProductoDto.descripcion") })
	TipoProducto tipoProductoDtoToTipoProducto(TipoProductoDto tipoProductoDto);

	List<TipoProducto> lisTipoProductoDtoToTipoProducto(List<TipoProductoDto> tipoProductoDtoList);

	List<TipoProductoDto> listTipoProductoToTipoProductoDto(List<TipoProducto> tipoProductoList);

	// TIPO_PAGO
	@Mappings({ @Mapping(target = "id", source = "tipoPago.idTipoPago"),
			@Mapping(target = "descripcion", source = "tipoPago.descripcion") })
	TipoPagoDto tipoPagoToTipoPagoDto(TipoPago tipoPago);

	@Mappings({ @Mapping(target = "idTipoPago", source = "tipoPagoDto.id"),
			@Mapping(target = "descripcion", source = "tipoPagoDto.descripcion") })
	TipoPago tipoPagoDtoToTipoPago(TipoPagoDto tipoPagoDto);

	List<TipoPago> listTipoPagoDtoToTipoPago(List<TipoPagoDto> tipoPagoDtoList);

	List<TipoPagoDto> listTipoPagoToTipoPagoDto(List<TipoPago> tipoPagoList);

	// ESTADO_COMPROBANTE
	@Mappings({ @Mapping(target = "id", source = "estadoComprobante.idEstadoComprobante"),
			@Mapping(target = "descripcion", source = "estadoComprobante.descripcion") })
	EstadoComprobanteDto estadoComprobanteToEstadoComprobanteDto(EstadoComprobante estadoComprobante);

	@Mappings({ @Mapping(target = "idEstadoComprobante", source = "estadoComprobanteDto.id"),
			@Mapping(target = "descripcion", source = "estadoComprobanteDto.descripcion") })
	EstadoComprobante estadoComprobanteDtoToEstadoComprobante(EstadoComprobanteDto estadoComprobanteDto);

	List<EstadoComprobante> listEstadoComprobanteDtoToEstadoComprobante(
			List<EstadoComprobanteDto> estadoComprobanteDtoList);

	List<EstadoComprobanteDto> listEstadoComprobanteToEstadoComprobanteDto(
			List<EstadoComprobante> estadoComprobanteList);

	// CATEGORIA_EMPLEADO
	@Mappings({ @Mapping(target = "id", source = "categoriaEmpleado.idCategoriaEmpleado"),
			@Mapping(target = "nombre", source = "categoriaEmpleado.nombre"),
			@Mapping(target = "funcion", source = "categoriaEmpleado.funcion") })
	CategoriaEmpleadoDto categoriaEmpleadoToCategoriaEmpleadoDto(CategoriaEmpleado categoriaEmpleado);

	@Mappings({ @Mapping(target = "idCategoriaEmpleado", source = "categoriaEmpleadoDto.id"),
			@Mapping(target = "nombre", source = "categoriaEmpleadoDto.nombre"),
			@Mapping(target = "funcion", source = "categoriaEmpleadoDto.funcion") })
	CategoriaEmpleado categoriaEmpleadoDtoToCategoriaEmpleado(CategoriaEmpleadoDto categoriaEmpleadoDto);

	List<CategoriaEmpleado> listCategoriaEmpleadoDtoToCategoriaEmpleado(
			List<CategoriaEmpleadoDto> categoriaEmpleadoDtoList);

	List<CategoriaEmpleadoDto> listCategoriaEmpleadoToCategoriaEmpleadoDto(
			List<CategoriaEmpleado> categoriaEmpleadoList);

	// CLIENTE
	@Mappings({ @Mapping(target = "id", source = "cliente.idCliente"),
			@Mapping(target = "codigoCliente", source = "cliente.codigoCliente"),
			@Mapping(target = "persona", source = "cliente.persona"),
			@Mapping(target = "estado", source = "cliente.estado") })
	ClienteDto clienteToClienteDto(Cliente cliente);

	@Mappings({ @Mapping(target = "idCliente", source = "clienteDto.id"),
			@Mapping(target = "codigoCliente", source = "clienteDto.codigoCliente"),
			@Mapping(target = "persona", source = "clienteDto.persona"),
			@Mapping(target = "estado", source = "clienteDto.estado") })
	Cliente clienteDtoToCliente(ClienteDto clienteDto);

	List<Cliente> listClienteDtoToCliente(List<ClienteDto> clienteDtoList);

	List<ClienteDto> listClienteToClienteDto(List<Cliente> clienteList);

	// EMPLEADO
	@Mappings({ @Mapping(target = "id", source = "empleado.idEmpleado"),
			@Mapping(target = "persona", source = "empleado.persona"),
			@Mapping(target = "fechaInicioTrabajo", source = "empleado.fechaInicioTrabajo"),
			@Mapping(target = "fechaFinTrabajo", source = "empleado.fechaFinTrabajo"),
			@Mapping(target = "estado", source = "empleado.estado"),
			@Mapping(target = "categoriaEmpleado", source = "empleado.categoriaEmpleado") })
	EmpleadoDto empleadoToEmpleadoDto(Empleado empleado);

	@Mappings({ @Mapping(target = "idEmpleado", source = "empleadoDto.id"),
			@Mapping(target = "persona", source = "empleadoDto.persona"),
			@Mapping(target = "fechaInicioTrabajo", source = "empleadoDto.fechaInicioTrabajo"),
			@Mapping(target = "fechaFinTrabajo", source = "empleadoDto.fechaFinTrabajo"),
			@Mapping(target = "estado", source = "empleadoDto.estado"),
			@Mapping(target = "categoriaEmpleado", source = "empleadoDto.categoriaEmpleado") })
	Empleado empleadoDtoToEmpleado(EmpleadoDto empleadoDto);

	List<Empleado> listEmpleadoDtoToEmpleado(List<EmpleadoDto> empleadoDtoList);

	List<EmpleadoDto> listEmpleadoToEmpleadoDto(List<Empleado> empleadoList);

	// PRODUCTO
	@Mappings({ @Mapping(target = "id", source = "producto.idProducto"),
			@Mapping(target = "codigoProducto", source = "producto.codigoProducto"),
			@Mapping(target = "nombre", source = "producto.nombre"),
			@Mapping(target = "descripcion", source = "producto.descripcion"),
			@Mapping(target = "precio", source = "producto.precio"),
			@Mapping(target = "estado", source = "producto.estado"),
			@Mapping(target = "stock", source = "producto.stock"),
			@Mapping(target = "tipoProducto", source = "producto.tipoProducto"),
			@Mapping(target = "historialProductoTienda", source = "producto.historialProductoTienda") })
	ProductoDto productoToProductoDto(Producto producto);

	@Mappings({ @Mapping(target = "idProducto", source = "productoDto.id"),
			@Mapping(target = "codigoProducto", source = "productoDto.codigoProducto"),
			@Mapping(target = "nombre", source = "productoDto.nombre"),
			@Mapping(target = "descripcion", source = "productoDto.descripcion"),
			@Mapping(target = "precio", source = "productoDto.precio"),
			@Mapping(target = "estado", source = "productoDto.estado"),
			@Mapping(target = "stock", source = "productoDto.stock"),
			@Mapping(target = "tipoProducto", source = "productoDto.tipoProducto"),
			@Mapping(target = "historialProductoTienda", source = "productoDto.historialProductoTienda") })
	Producto productoDtoToProducto(ProductoDto productoDto);

	List<Producto> listProductoDtoToProducto(List<ProductoDto> productoDtoList);

	List<ProductoDto> listProductoToProductoDto(List<Producto> productoList);

	// HISTORIAL_PRODUCTO
	@Mappings({ @Mapping(target = "id", source = "historialProductoTienda.idHistorialProductoTienda"),
			@Mapping(target = "producto", source = "historialProductoTienda.producto"),
			@Mapping(target = "fecha", source = "historialProductoTienda.fecha"),
			@Mapping(target = "precio", source = "historialProductoTienda.precio") })
	HistorialProductoTiendaDto historialProductoTiendaTohistorialProductoTiendaDto(
			HistorialProductoTienda historialProductoTienda);

	@Mappings({ @Mapping(target = "idHistorialProductoTienda", source = "historialProductoTiendaDto.id"),
			@Mapping(target = "producto", source = "historialProductoTiendaDto.producto"),
			@Mapping(target = "fecha", source = "historialProductoTiendaDto.fecha"),
			@Mapping(target = "precio", source = "historialProductoTiendaDto.precio") })
	HistorialProductoTienda historialProductoTiendaDtoTohistorialProductoTienda(
			HistorialProductoTiendaDto historialProductoTiendaDto);

	List<HistorialProductoTienda> listHistorialProductoTiendaDtoTohistorialProductoTienda(
			List<HistorialProductoTiendaDto> historialProductoTiendaDtoList);

	List<HistorialProductoTiendaDto> listHistorialProductoTiendaTohistorialProductoTiendaDto(
			List<HistorialProductoTienda> historialProductoTiendaList);

	// PROVEEDOR_PRODUCTO
	@Mappings({ @Mapping(target = "id", source = "proveedorProducto.idProveedorProducto"),
			@Mapping(target = "proveedor", source = "proveedorProducto.proveedor"),
			@Mapping(target = "producto", source = "proveedorProducto.producto"),
			@Mapping(target = "precio", source = "proveedorProducto.precio"),
			@Mapping(target = "historialProveedorProducto", source = "proveedorProducto.historialProveedorProducto") })
	ProveedorProductoDto proveedorProductoToProveedorProductoDto(ProveedorProducto proveedorProducto);

	@Mappings({ @Mapping(target = "idProveedorProducto", source = "proveedorProductoDto.id"),
			@Mapping(target = "proveedor", source = "proveedorProductoDto.proveedor"),
			@Mapping(target = "producto", source = "proveedorProductoDto.producto"),
			@Mapping(target = "precio", source = "proveedorProductoDto.precio"),
			@Mapping(target = "historialProveedorProducto", source = "proveedorProductoDto.historialProveedorProducto") })
	ProveedorProducto proveedorProductoDtoToProveedorProducto(ProveedorProductoDto proveedorProductoDto);

	List<ProveedorProducto> listProveedorProductoDtoToProveedorProducto(
			List<ProveedorProductoDto> proveedorProductoDtoList);

	List<ProveedorProductoDto> listProveedorProductoToProveedorProductoDto(
			List<ProveedorProducto> proveedorProductolist);

	// HISTORIAL_PROVEEDOR_PRODUCTO
	@Mappings({ @Mapping(target = "id", source = "historialProveedorProducto.idHistorialProveedorProducto"),
			@Mapping(target = "proveedorProducto", source = "historialProveedorProducto.proveedorProducto"),
			@Mapping(target = "precio", source = "historialProveedorProducto.precio"),
			@Mapping(target = "fecha", source = "historialProveedorProducto.fecha") })
	HistorialProveedorProductoDto historialProveedorProductoToHistorialProveedorProductoDto(
			HistorialProveedorProducto historialProveedorProducto);

	@Mappings({ @Mapping(target = "idHistorialProveedorProducto", source = "historialProveedorProductoDto.id"),
			@Mapping(target = "proveedorProducto", source = "historialProveedorProductoDto.proveedorProducto"),
			@Mapping(target = "precio", source = "historialProveedorProductoDto.precio"),
			@Mapping(target = "fecha", source = "historialProveedorProductoDto.fecha") })
	HistorialProveedorProducto historialProveedorProductoDtoToHistorialProveedorProducto(
			HistorialProveedorProductoDto historialProveedorProductoDto);

	List<HistorialProveedorProducto> listHistorialProveedorProductoDtoToHistorialProveedorProducto(
			List<HistorialProveedorProductoDto> historialProveedorProductoDtoList);

	List<HistorialProveedorProductoDto> listHistorialProveedorProductoToHistorialProveedorProductoDto(
			List<HistorialProveedorProducto> historialProveedorProductolist);

	// PEDIDO
	@Mappings({ @Mapping(target = "id", source = "pedido.idPedido"),
			@Mapping(target = "codigo", source = "pedido.codigo"),
			@Mapping(target = "cliente", source = "pedido.cliente"),
			@Mapping(target = "producto", source = "pedido.producto"),
			@Mapping(target = "cantidad", source = "pedido.cantidad"),
			@Mapping(target = "fecha", source = "pedido.fecha"),
			@Mapping(target = "empleado", source = "pedido.empleado"),
			@Mapping(target = "precioUnitario", source = "pedido.precioUnitario"),
			@Mapping(target = "descuento", source = "pedido.descuento"),
			@Mapping(target = "precioUnitarioFinal", source = "pedido.precioUnitarioFinal") })
	PedidoDto pedidoToPedidoDto(Pedido pedido);

	@Mappings({ @Mapping(target = "idPedido", source = "pedidoDto.id"),
			@Mapping(target = "codigo", source = "pedidoDto.codigo"),
			@Mapping(target = "cliente", source = "pedidoDto.cliente"),
			@Mapping(target = "producto", source = "pedidoDto.producto"),
			@Mapping(target = "cantidad", source = "pedidoDto.cantidad"),
			@Mapping(target = "fecha", source = "pedidoDto.fecha"),
			@Mapping(target = "empleado", source = "pedidoDto.empleado"),
			@Mapping(target = "precioUnitario", source = "pedidoDto.precioUnitario"),
			@Mapping(target = "descuento", source = "pedidoDto.descuento"),
			@Mapping(target = "precioUnitarioFinal", source = "pedidoDto.precioUnitarioFinal") })
	Pedido pedidoDtoToPedido(PedidoDto pedidoDto);

	List<Pedido> listPedidoDtoToPedido(List<PedidoDto> pedidoDtoList);

	List<PedidoDto> listPedidoToPedidoDto(List<Pedido> pedidoList);
}

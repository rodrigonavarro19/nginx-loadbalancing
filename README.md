# Docker Compose para Pruebas de Servidor Nginx

Este repositorio contiene un entorno Docker Compose configurado para probar un servidor Nginx localmente.

## Requisitos
Docker
Docker Compose

## Uso

1. Clona este repositorio en tu máquina local:

```bash
git clone https://github.com/rodrigonavarro19/nginx-loadbalancing.git
```

2. Navega al directorio del proyecto:

```bash
cd /nginx-loadbalancing
```

3. Inicia los contenedores utilizando Docker Compose:

```bash
docker-compose up --build -d
```

4. Accede al servidor Nginx desde tu navegador web en http://localhost. Verás una página de prueba que retorna una lista de Usuarios.

5. Para detener y eliminar los contenedores, ejecuta:
```bash
docker-compose down
```
# booking-hoteles

## Descripción del Proyecto
El objetivo principal de la aplicación es facilitar la creación, modificación y gestión de reservas de hospedaje. La aplicación permite trabajar con diferentes tipos de alojamiento y ofrece cálculos personalizados para tarifas según las fechas de la estadía.

### Funcionalidades principales:
1. **Buscar Alojamientos**
2. **Confirmar habitaciones en un hotel**
3. **Reservar**
4. **ctualizar reserva**

### Tipos de Alojamiento:
- Hotel
- Apartamento
- Finca
- Día de Sol

### Tarifas y Cálculos:
- **Aumentos:**
  - +15% si las fechas comprenden los últimos 5 días del mes.
  - +10% si las fechas comprenden del 10 al 15 del mes.
- **Descuentos:**
  - -8% si las fechas comprenden del 5 al 10 del mes.
- El precio total se calcula como:
  - `(Precio habitación más simple x Cantidad de habitaciones)` + Descuentos/Aumentos.

### Información adicional para Días de Sol:
- Muestra las actividades disponibles, si incluye almuerzo o refrigerio, y su precio.

## Instrucciones para Ejecutar

1. Clona este repositorio:
   ```bash
   git clone https://github.com/CarlosCuadrado-24/booking-hoteles.git
   ```

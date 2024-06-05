-- Create the Television table
-- CREATE TABLE IF NOT EXISTS televisions (
--     id SERIAL PRIMARY KEY,
--     type VARCHAR(50) NOT NULL,
--     brand VARCHAR(50) NOT NULL,
--     name VARCHAR(50) NOT NULL,
--     price DECIMAL(10, 2) NOT NULL,
--     availableSize DECIMAL(5, 2) NOT NULL,
--     refreshRate DECIMAL(5, 2) NOT NULL,
--     screenType VARCHAR(50) NOT NULL,
--     screenQuality VARCHAR(50) NOT NULL,
--     smartTv BOOLEAN NOT NULL,
--     wifi BOOLEAN NOT NULL,
--     voiceControl BOOLEAN NOT NULL,
--     hdr BOOLEAN NOT NULL,
--     bluetooth BOOLEAN NOT NULL,
--     ambiLight BOOLEAN NOT NULL,
--     originalStock INTEGER NOT NULL,
--     sold INTEGER NOT NULL
-- );

-- Insert sample data into the Television table
INSERT INTO televisions (type, brand, name, price, available_size, refresh_rate, screen_type, screen_quality, smart_tv, wifi, voice_control, hdr, bluetooth, ambi_light, original_stock, sold) VALUES
('LED', 'Samsung', 'UA32T5300', 299.99, 32.00, 60.00, 'Flat', 'HD', true, true, false, true, true, false, 100, 10),
('OLED', 'LG', 'OLED55CXPUA', 1499.99, 55.00, 120.00, 'Curved', '4K', true, true, true, true, true, true, 50, 5),
('QLED', 'Sony', 'XBR55X900H', 999.99, 55.00, 120.00, 'Flat', '4K', true, true, true, true, true, false, 75, 20),
('LCD', 'Panasonic', 'TC-32LX24', 199.99, 32.00, 60.00, 'Flat', 'HD', false, false, false, false, false, false, 200, 50),
('Plasma', 'Pioneer', 'KRP-500M', 2499.99, 50.00, 60.00, 'Flat', 'Full HD', false, false, false, true, false, true, 30, 2),
('LED', 'Toshiba', '32LF221U19', 129.99, 32.00, 60.00, 'Flat', 'HD', true, true, false, false, true, false, 150, 25),
('OLED', 'Vizio', 'OLED65-H1', 1799.99, 65.00, 120.00, 'Flat', '4K', true, true, true, true, true, true, 40, 8),
('QLED', 'Hisense', '55H9G', 699.99, 55.00, 120.00, 'Flat', '4K', true, true, true, true, true, false, 60, 15),
('LCD', 'Sharp', 'LC-32LE451U', 179.99, 32.00, 60.00, 'Flat', 'HD', false, false, false, false, false, false, 180, 45),
('Plasma', 'Samsung', 'PN60F8500', 2199.99, 60.00, 60.00, 'Flat', 'Full HD', false, false, false, true, false, true, 25, 3);
package parquet

import org.apache.avro.Schema
import org.apache.avro.generic.GenericData
import org.apache.avro.io.DatumWriter

class ParquetWriter {

    String schema = """{"namespace": "com.softwood.test",
    "type": "record", 
    "name": "myrecordname", 
    "fields": [
        {"name": "myInteger", "type": "int"},
        {"name": "myString",  "type": ["string", "null"]},
        ]}"""

    //" {"name": "myDecimal", "type": [{"type": "fixed", "size":16, "logicalType": "decimal", "name": "mydecimaltype1", "precision": 32, "scale": 4}, "null"]},"
    // " {"name": "myDate", "type": [{"type": "int", "logicalType" : "date"}, "null"]}"

    Schema.Parser parser = new Schema.Parser().setValidate(true)
    Schema avroSchema = parser.parse(schema)

    DatumWriter wr = new GenericData().createDatumWriter(avroSchema)

    //def wr2 = new GenericData().

    //wr.

    //wr.put("myInteger", 1)
    //record.put("myString", "string value 1")
}

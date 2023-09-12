/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.database;

/**
 *
 * @author Alexandre Gonçalves
 */
import org.bson.Document;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;


public class ConnectionDb {
    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    
    public void Conexao(String connectionString,String databaseName, String collectionName)  {
        mongoClient = MongoClients.create (connectionString);
        database = mongoClient.getDatabase(databaseName);
        collection = database.getCollection(collectionName);
 }
 public void Close(){
     mongoClient.close();
 }
 
 public void Insert(Document document){
     collection.insertOne(document);
 }
 
 public void Delete(Document document){
    collection.deleteOne(document);
 }
 
 public void Update(Document filter, Document update){
    collection.updateOne(filter, new Document("$set", update));
 }
 
 public Document findUser(String usuario, String senha) throws Exception{
     Document query = new Document("nome",usuario).append("senha", senha);
     Document user = collection.find(query).first();
        if (user == null) {
            throw new Exception("Usuário não encontrado");
        }
        return user;
 }
 public Document findCadastro(Document campo) throws Exception{
    Document cadastro = collection.find(campo).first();
    if (cadastro == null) {
        throw new Exception("Cadastro Não encontrado");
    }
    return cadastro;
    }
 
 public List<Document> findCadastros(Document query) {
        List<Document> cadastrosEncontrados = new ArrayList<>();

        // Executar a consulta na coleção
        try (MongoCursor<Document> cursor = collection.find(query).iterator()) {
            while (cursor.hasNext()) {
                Document cadastro = cursor.next();
                cadastrosEncontrados.add(cadastro);
            }
        }

        return cadastrosEncontrados;
    }
}
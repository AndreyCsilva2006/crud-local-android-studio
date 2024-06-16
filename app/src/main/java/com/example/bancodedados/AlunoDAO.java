package com.example.bancodedados;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

// DAO - Data Access Object (Objeto de Acesso de Dados)
public class AlunoDAO {

    private Conexao conexao;
    private SQLiteDatabase banco;

    // Metódo Construtor
    public AlunoDAO(Context context){
        conexao = new Conexao(context);
        banco = conexao.getWritableDatabase();
    }

    public long inserir(Aluno aluno) {
        // values é a váriavel que recebe o conteúdo para pôr no banco de dados
        ContentValues values = new ContentValues();
        values.put("nome", aluno.getNome());
        values.put("cpf", aluno.getCpf());
        values.put("telefone", aluno.getTelefone());
        //           tabela   nullColumnHack(Colunas vazias ou não)
        return banco.insert("aluno", null, values);
    }

    // metodo para obter todos a lista
    public List<Aluno> obterTodos() {
        List<Aluno> alunos = new ArrayList<>();
        // cursor aponta para as linhas
        // parametros query para consultar: Tabela(aluno) vetor String que retornará as colunas. (null para o selection, selectionArgs, groupBy, having, orderBy).
        Cursor cursor = banco.query("aluno", new String[]{"id", "nome", "cpf", "telefone"}, null, null, null, null, null, null);
        // fazer o cursor andar
        while(cursor.moveToNext()) {
            Aluno a = new Aluno();
            // indice 0 para o id de acordo com os parametros da query e tbm o seu tipo (int).
            a.setId(cursor.getInt(0));
            a.setNome(cursor.getString(1));
            a.setCpf(cursor.getString(2));
            a.setTelefone(cursor.getString(3));
            // adiciona na lista
            alunos.add(a);
        }
        return alunos;
    }

    // método para excluir registro
    public void excluir(Aluno a) {
        // informa a tabela, a clausala where e depois um vetor de string []
        banco.delete("aluno", "id = ?", new String[]{a.getId().toString()});
    }

    // método atualizar
    public void atualizar(Aluno aluno) {
        ContentValues values = new ContentValues();
        values.put("nome", aluno.getNome());
        values.put("cpf", aluno.getCpf());
        values.put("telefone", aluno.getTelefone());
        // id = ? significa um id algum valor.
        banco.update("aluno", values, "id = ?", new String[]{aluno.getId().toString()});
    }
}

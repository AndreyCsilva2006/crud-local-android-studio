package com.example.bancodedados;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.example.bancodedados.Aluno;

public class Conexao extends SQLiteOpenHelper {

    private static final String name = "banco.db";
    private static String dbTable = "aluno";
    private static final int version = 1;

    private static String id = "id";
    private static String nome = "nome";
    private static String email = "email";
    private static String senha = "senha";
    private static String cpf = "cpf";
    private static String telefone = "telefone";

    public Conexao(Context context){
        super(context, name, null, version);
}

    @Override
    public void onCreate(SQLiteDatabase db) {
        // Comando SQL
        db.execSQL("create table aluno(id integer primary key autoincrement, " + "nome varchar(50), cpf varchar(50), telefone varchar(50))");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void addAluno(Aluno alunos){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();
        values.put(nome, alunos.getNome());
        values.put(email, alunos.getEmail());
        values.put(senha, alunos.getSenha());
        values.put(cpf, alunos.getCpf());
        values.put(telefone, alunos.getTelefone());

        db.insert(dbTable, null, values);
    }
}

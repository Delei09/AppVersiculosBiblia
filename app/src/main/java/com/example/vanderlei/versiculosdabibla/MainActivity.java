package com.example.vanderlei.versiculosdabibla;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarTexto(View view){
        TextView textoGerado = (TextView) findViewById(R.id.textoResultado);
        int x = new Random().nextInt(10);
        switch (x){

            case(0):
                textoGerado.setText("Eis que já tens ouvido o que fizeram os reis da Assíria a todas as terras, destruindo-as totalmente; e tu, te livrarás?\n" +
                        "\n" +
                        "2 Reis 19:11 ");
                break;
            case(1):
                textoGerado.setText("O amor é paciente, o amor é bondoso. Não inveja, não se vangloria, não se orgulha. Não maltrata, não procura seus interesses, não se ira facilmente, não guarda rancor. O amor não se alegra com a injustiça, mas se alegra com a verdade. Tudo sofre, tudo crê, tudo espera, tudo suporta.\n" +
                        "1 Coríntios 13:4-7");
                break;
            case(2):
                textoGerado.setText("Então Pedro aproximou-se de Jesus e perguntou: \"Senhor, quantas vezes deverei perdoar a meu irmão quando ele pecar contra mim? Até sete vezes?\" Jesus respondeu: \"Eu digo a você: Não até sete, mas até setenta vezes sete.\n" +
                        "Mateus 18:21-22");
                break;
            case(3):
                textoGerado.setText("Não fui eu que ordenei a você? Seja forte e corajoso! Não se apavore nem desanime, pois o Senhor, o seu Deus, estará com você por onde você andar\".\n" +
                        "Josué 1:9");
                break;
            case(4):
                textoGerado.setText("Porque sou eu que conheço os planos que tenho para vocês', diz o Senhor, 'planos de fazê-los prosperar e não de causar dano, planos de dar a vocês esperança e um futuro.\n" +
                        "Jeremias 29:11");
                break;
            case(5):
                textoGerado.setText("\"O Senhor te abençoe e te guarde; o Senhor faça resplandecer\n" +
                        "o seu rosto sobre ti\n" +
                        "e te conceda graça; o Senhor volte para ti o seu rosto\n" +
                        "e te dê paz.\n" +
                        "Números 6:24-26");
                break;
            case(6):
                textoGerado.setText("Por isso não tema, pois estou com você;\n" +
                        "não tenha medo, pois sou o seu Deus.\n" +
                        "Eu o fortalecerei e o ajudarei;\n" +
                        "eu o segurarei\n" +
                        "com a minha mão direita vitoriosa.\n" +
                        "Isaías 41:10");
                break;
            case(7):
                textoGerado.setText("\"Pai nosso, que estás nos céus!\n" +
                        "Santificado seja o teu nome. Venha o teu Reino;\n" +
                        "seja feita a tua vontade,\n" +
                        "assim na terra como no céu. Dá-nos hoje o nosso\n" +
                        "pão de cada dia. Perdoa as nossas dívidas,\n" +
                        "assim como perdoamos\n" +
                        "aos nossos devedores. E não nos deixes cair\n" +
                        "em tentação,\n" +
                        "mas livra-nos do mal,\n" +
                        "porque teu é o Reino, o poder e a glória para sempre. Amém.\n" +
                        "Mateus 6:9-13");
                break;
            case(8):
                textoGerado.setText("Portanto, não se preocupem com o amanhã, pois o amanhã trará as suas próprias preocupações. Basta a cada dia o seu próprio mal.\n" +
                        "Mateus 6:34");
                break;
            case(9):
                textoGerado.setText("Assim, eles já não são dois, mas sim uma só carne. Portanto, o que Deus uniu, ninguém separe\".\n" +
                        "Mateus 19:6");
                break;
            case(10):
                textoGerado.setText("\"Eu disse essas coisas para que em mim vocês tenham paz. Neste mundo vocês terão aflições; contudo, tenham ânimo! Eu venci o mundo\".\n" +
                        "João 16:33");
                break;
        }
    }


}

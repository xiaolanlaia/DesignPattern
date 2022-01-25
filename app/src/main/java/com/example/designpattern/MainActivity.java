package com.example.designpattern;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.designpattern.CreatePattern.BuilderPattern.example.TodayFool;
import com.example.designpattern.CreatePattern.BuilderPattern.learn.Builder;
import com.example.designpattern.CreatePattern.BuilderPattern.learn.Director;
import com.example.designpattern.CreatePattern.BuilderPattern.learn.MacBuilder;
import com.example.designpattern.CreatePattern.ClonePattern.WordDocument;
import com.example.designpattern.CreatePattern.FactoryPattern.example.Animal;
import com.example.designpattern.CreatePattern.FactoryPattern.example.FactoryAnimal;
import com.example.designpattern.CreatePattern.FactoryPattern.example.FactoryAnimalConcrete;
import com.example.designpattern.CreatePattern.FactoryPattern.learn.Factory;
import com.example.designpattern.CreatePattern.FactoryPattern.learn.FactoryConcrete;
import com.example.designpattern.CreatePattern.FactoryPattern.learn.Product;
import com.example.designpattern.CreatePattern.FactoryPatternAbstract.FactoryAbstract;
import com.example.designpattern.CreatePattern.FactoryPatternAbstract.FactoryConcrete1;
import com.example.designpattern.CreatePattern.FactoryPatternAbstract.ProductAAbstract;
import com.example.designpattern.CreatePattern.FactoryPatternAbstract.ProductBAbstract;
import com.example.designpattern.StragetyPattern.learn.BusStrategy;
import com.example.designpattern.StragetyPattern.learn.TrafficCalculator;
import com.example.designpattern.chainPattern.ConcreteHandler1;
import com.example.designpattern.chainPattern.ConcreteHandler2;
import com.example.designpattern.commandPattern.exam.Broker;
import com.example.designpattern.commandPattern.exam.BuyStock;
import com.example.designpattern.commandPattern.exam.ShellStock;
import com.example.designpattern.commandPattern.exam.Stock;
import com.example.designpattern.commandPattern.learn.Command;
import com.example.designpattern.commandPattern.learn.ConcreteCommand;
import com.example.designpattern.commandPattern.learn.Invoker;
import com.example.designpattern.commandPattern.learn.Receiver;
import com.example.designpattern.interpreterPattern.Expression;
import com.example.designpattern.interpreterPattern.InterpreterPattern;
import com.example.designpattern.mediator.exam.User;
import com.example.designpattern.memotoPattern.CallOfDuty;
import com.example.designpattern.memotoPattern.Careteker;
import com.example.designpattern.observerPattern.Coder;
import com.example.designpattern.observerPattern.DevTechFrontier;
import com.example.designpattern.statePattern.TvController;
import com.example.designpattern.templatePattern.AbstractComputer;
import com.example.designpattern.templatePattern.CoderComputer;
import com.example.designpattern.templatePattern.MilitaryComputer;
import com.example.designpattern.visitorPattern.learn.BusinessReport;
import com.example.designpattern.visitorPattern.learn.CEOVisitor;
import com.example.designpattern.visitorPattern.learn.CTOVisitor;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.builder_pattern)
    Button builder_pattern;
    @BindView(R.id.builder_pattern_example)
    Button builder_pattern_example;
    @BindView(R.id.clone_pattern)
    Button clone_pattern;
    @BindView(R.id.clone_pattern_example)
    Button clone_pattern_example;
    @BindView(R.id.factory_pattern)
    Button factory_pattern;
    @BindView(R.id.factory_pattern_example)
    Button factory_pattern_example;
    @BindView(R.id.factory_abstract_pattern)
    Button factory_abstract_pattern;
    @BindView(R.id.factory_abstract_pattern_example)
    Button factory_abstract_pattern_example;
    @BindView(R.id.strategy_pattern)
    Button strategy_pattern;
    @BindView(R.id.strategy_pattern_example)
    Button strategy_pattern_example;
    @BindView(R.id.state_pattern)
    Button state_pattern;
    @BindView(R.id.state_pattern_example)
    Button state_pattern_example;
    @BindView(R.id.chain_pattern)
    Button chain_pattern;
    @BindView(R.id.chain_pattern_example)
    Button chain_pattern_example;
    @BindView(R.id.interpreter_pattern)
    Button interpreter_pattern;
    @BindView(R.id.interpreter_pattern_example)
    Button interpreter_pattern_example;
    @BindView(R.id.command_pattern)
    Button command_pattern;
    @BindView(R.id.command_pattern_example)
    Button command_pattern_example;
    @BindView(R.id.observer_pattern)
    Button observer_pattern;
    @BindView(R.id.observer_pattern_example)
    Button observer_pattern_example;
    @BindView(R.id.memoto_pattern)
    Button memoto_pattern;
    @BindView(R.id.memoto_pattern_example)
    Button memoto_pattern_example;
    @BindView(R.id.template_pattern)
    Button template_pattern;
    @BindView(R.id.template_pattern_example)
    Button template_pattern_example;
    @BindView(R.id.visitor_pattern)
    Button visitor_pattern;
    @BindView(R.id.visitor_pattern_example)
    Button visitor_pattern_example;
    @BindView(R.id.mediator_pattern)
    Button mediator_pattern;
    @BindView(R.id.mediator_pattern_example)
    Button mediator_pattern_example;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        builder_pattern.setOnClickListener(this);
        builder_pattern_example.setOnClickListener(this);
        clone_pattern.setOnClickListener(this);
        clone_pattern_example.setOnClickListener(this);
        factory_pattern.setOnClickListener(this);
        factory_pattern_example.setOnClickListener(this);
        factory_abstract_pattern.setOnClickListener(this);
        factory_abstract_pattern_example.setOnClickListener(this);
        strategy_pattern.setOnClickListener(this);
        strategy_pattern_example.setOnClickListener(this);
        state_pattern.setOnClickListener(this);
        state_pattern_example.setOnClickListener(this);
        chain_pattern.setOnClickListener(this);
        chain_pattern_example.setOnClickListener(this);
        interpreter_pattern.setOnClickListener(this);
        interpreter_pattern_example.setOnClickListener(this);
        command_pattern.setOnClickListener(this);
        command_pattern_example.setOnClickListener(this);
        observer_pattern.setOnClickListener(this);
        observer_pattern_example.setOnClickListener(this);
        memoto_pattern.setOnClickListener(this);
        memoto_pattern_example.setOnClickListener(this);
        template_pattern.setOnClickListener(this);
        template_pattern_example.setOnClickListener(this);
        visitor_pattern.setOnClickListener(this);
        visitor_pattern_example.setOnClickListener(this);
        mediator_pattern.setOnClickListener(this);
        mediator_pattern_example.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.builder_pattern : {

                Builder builder = new MacBuilder();
                Director pcDirector = new Director(builder);
                pcDirector.construct("英特尔主板","Retina显示器");
                Log.d("__ComputerInfo",builder.create().toString());
                break;
            }
            case R.id.builder_pattern_example : {
                new TodayFool()
                        .setEgg("egg")
                        .setMeat("meat")
                        .whatDayEat();
                break;
            }
            case R.id.clone_pattern : {
                WordDocument originDocument = new WordDocument();
                originDocument.setmText("originDocument 文档");
                originDocument.addImage("图片 1");
                originDocument.addImage("图片 2");
                originDocument.addImage("图片 3");
                originDocument.showDocument();

                //拷贝一份文档
                WordDocument doc2 = (WordDocument)originDocument.clone();
                doc2.showDocument();
                doc2.setmText("doc 2 文档");
                doc2.addIndex(100);
                doc2.addIndex(200);
                doc2.showDocument();
                originDocument.showDocument();

                ArrayList<String> arrayList = new ArrayList<>();
                ArrayList<String> newStr = (ArrayList<String>)arrayList.clone();

                break;
            }
            case R.id.clone_pattern_example : {

                break;
            }
            case R.id.factory_pattern : {

                Factory factory = new FactoryConcrete();
                Product product = factory.createProduct();
                product.method();

                break;
            }
            case R.id.factory_pattern_example : {
                FactoryAnimal factoryAnimal = new FactoryAnimalConcrete();
                Animal animal = factoryAnimal.createAnimal();
                animal.animalType();
                break;
            }
            case R.id.factory_abstract_pattern : {
                FactoryAbstract factoryAbstract = new FactoryConcrete1();
                ProductAAbstract productAAbstract = factoryAbstract.createProductA();
                ProductBAbstract productBAbstract = factoryAbstract.createProductB();
                productAAbstract.method();
                productBAbstract.method();

                break;
            }
            case R.id.factory_abstract_pattern_example : {

                break;
            }
            case R.id.strategy_pattern : {
                TrafficCalculator calculator = new TrafficCalculator();
                calculator.setCalculateStrategy(new BusStrategy());
                Log.d("__price",""+calculator.calculatePrice(16));
                break;
            }
            case R.id.strategy_pattern_example : {

                break;
            }
            case R.id.state_pattern : {
                TvController tvController = new TvController();
                tvController.powerOn();
                tvController.nextChannel();
                tvController.powerOff();
                tvController.nextChannel();

                break;
            }
            case R.id.state_pattern_example : {

                break;
            }
            case R.id.chain_pattern : {

                ConcreteHandler1 handler1 = new ConcreteHandler1();
                ConcreteHandler2 handler2 = new ConcreteHandler2();

                handler1.successor = handler2;
                handler2.successor = handler1;

                handler1.handleRequest("ConcreteHandler2");

                break;
            }
            case R.id.chain_pattern_example : {

                break;
            }
            case R.id.interpreter_pattern : {
                Expression isMale = InterpreterPattern.getMaleExpression();
                Expression isMarriedWoman = InterpreterPattern.getMarriedWomanExpression();

                Log.d("__expression","John is male? "+isMale.interpret("John"));
                Log.d("__expression","Julie is a married women?  "+isMarriedWoman.interpret("Married Julie"));
                break;
            }
            case R.id.interpreter_pattern_example : {

                break;
            }
            case R.id.command_pattern : {
                Receiver receiver = new Receiver();
                Command command = new ConcreteCommand(receiver);
                Invoker invoker = new Invoker(command);
                invoker.action();
                break;
            }
            case R.id.command_pattern_example : {

                Stock abcStock = new Stock();
                BuyStock buyStock = new BuyStock(abcStock);
                ShellStock shellStock = new ShellStock(abcStock);
                Broker broker = new Broker();
                broker.takeOrder(buyStock);
                broker.takeOrder(shellStock);
                broker.placeOrders();
                break;
            }
            case R.id.observer_pattern : {
                DevTechFrontier devTechFrontier = new DevTechFrontier();
                Coder coder1 = new Coder("coder1");
                Coder coder2 = new Coder("coder2");
                Coder coder3 = new Coder("coder3");

                devTechFrontier.addObserver(coder1);
                devTechFrontier.addObserver(coder2);
                devTechFrontier.addObserver(coder3);

                devTechFrontier.postNewPublication("发布了新消息");
                break;
            }
            case R.id.observer_pattern_example : {


                break;
            }
            case R.id.memoto_pattern : {

                CallOfDuty game = new CallOfDuty();
                game.play();
                Careteker careteker = new Careteker();
                careteker.archive(game.createMemoto());
                game.quit();
                CallOfDuty newGame = new CallOfDuty();
                newGame.restore(careteker.getMemoto());
                break;
            }
            case R.id.memoto_pattern_example : {


                break;
            }
            case R.id.template_pattern : {
                AbstractComputer abstractComputer = new CoderComputer();
                abstractComputer.startUp();

                abstractComputer = new MilitaryComputer();
                abstractComputer.startUp();

                break;
            }
            case R.id.template_pattern_example : {


                break;
            }
            case R.id.visitor_pattern : {

                BusinessReport businessReport = new BusinessReport();
                Log.d("__businessReport-CEO","-----------------");
                businessReport.showReport(new CEOVisitor());
                Log.d("__businessReport-CTO","-----------------");
                businessReport.showReport(new CTOVisitor());

                break;
            }
            case R.id.visitor_pattern_example : {


                break;
            }
            case R.id.mediator_pattern : {
                User robert = new User("Robert");
                User john = new User("John");

                robert.sendMessage("Hi John");
                john.sendMessage("Hello Robert");

                break;
            }
            case R.id.mediator_pattern_example : {


                break;
            }
        }
    }
}